package com.ociweb.iot.grove;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import com.ociweb.iot.hardware.I2CConnection;
import com.ociweb.iot.hardware.IODevice;
import com.ociweb.pronghorn.iot.schema.GroveResponseSchema;
import com.ociweb.pronghorn.pipe.Pipe;

public class TempAndHumidTwig implements IODevice{

	public byte addr = 0x04;
	private byte[] tempData = new byte[4];
	private byte[] humData = new byte[4];
	private byte connection;
	private byte module_type;
	public enum MODULE_TYPE{
		DHT11,DHT22,DHT21,DHT2301;
	}
	
	public TempAndHumidTwig(int connection, MODULE_TYPE module_type) {
		this.connection = (byte) connection;
		switch(module_type){
		case DHT11 :
			this.module_type = 0;
			break;
		case DHT22 :
			this.module_type = 1;
			break;
		case DHT21 :
			this.module_type = 2;
			break;
		case DHT2301 :
			this.module_type = 3;
			break;
		}
	}

	public I2CConnection getI2CConnection(){
		byte[] TEMPHUMID_READCMD = {0x01, 40, connection, module_type, 0x00};
	    byte[] TEMPHUMID_SETUP = {0x01, 0x05, 0x00, 0x00, 0x00}; 
	    byte TEMPHUMID_ADDR = 0x04;
	    byte TEMPHUMID_BYTESTOREAD = 8;
	    byte TEMPHUMID_REGISTER = connection;
	    return new I2CConnection(this, TEMPHUMID_ADDR, TEMPHUMID_READCMD, TEMPHUMID_BYTESTOREAD, TEMPHUMID_REGISTER, TEMPHUMID_SETUP);
	}
	
	public float[] interpretGrovePiData(byte[] backing, int position, int length, int mask){
		assert(length == 8) : "Incorrect length of data passed into DHT sensor class";
		for (int i = 0; i < tempData.length; i++) {
			tempData[i]= backing[(position+i)%mask];
		}
		for (int i = 0; i < humData.length; i++) {
			humData[i]= backing[(position+i)%mask];
		}
		System.out.println("");
		System.out.println(Arrays.toString(tempData)+" "+Arrays.toString(humData));
		float[] temp = {ByteBuffer.wrap(tempData).order(ByteOrder.LITTLE_ENDIAN).getFloat(), 
				ByteBuffer.wrap(humData).order(ByteOrder.LITTLE_ENDIAN).getFloat()};
		return temp;
	}

	@Override
	public boolean isInput() {
		return true;
	}

	@Override
	public boolean isOutput() {
		return false;
	}

	@Override
	public boolean isPWM() {
		return false;
	}

	@Override
	public int range() {
		return 0;
	}

//	@Override
//	public boolean isI2C() {
//		return true;
//	}


	@Override
	public boolean isGrove() {
		return false; //this has to be false
	}

    @Override
    public int response() {       
       return 600;      
    }
    
}

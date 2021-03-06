/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.ociweb.iot.grove.motor_driver;

import com.ociweb.iot.hardware.I2CConnection;
import com.ociweb.iot.hardware.I2CIODevice;
import com.ociweb.iot.maker.FogCommandChannel;

/**
 *
 * @author huydo
 */
public enum MotorDriverTwig implements I2CIODevice {
    MotorDriver(){
        @Override
        public boolean isInput() {
            return false;
        }
        
        @Override
        public boolean isOutput() {
            return true;
        }
        @Override
        public I2CConnection getI2CConnection() { //putting getI2CConnection in i2cOutput twigs allows setup commands to be sent
            return null;
        }
        
        
        @Override
        public int defaultPullRateMS() {
            return 1000;
            
        }
        @Override
        public int pullResponseMinWaitNS() {
            return 0;
        }

        @SuppressWarnings("unchecked")
        @Override
        public MotorDriver_Transducer newTransducer(FogCommandChannel...ch){
            return new MotorDriver_Transducer(ch[0]);//TODO:feed the right chip enum, create two seperate twigs
        }
        
        /**
         * @return True if this twig is Pulse Width Modulated (PWM) device, and
         *         false otherwise.
         */
        @Override
        public boolean isPWM() {
            return false;
        }
        
        /**
         * @return True if this twig is an I2C device, and false otherwise.
         */
        public boolean isI2C() {
            return true;
        }
        
        
        
        /**
         * @return The possible value range for reads from this device (from zero).
         */
        @Override
        public int range() {
            return 256;
        }
        
        /**
         * @return the setup bytes needed to initialized the connected I2C device
         */
        public byte[] I2COutSetup() {
            return null;
        }
        
        /**
         * Validates if the I2C data from from the device is a valid response for this twig
         *
         * @param backing
         * @param position
         * @param length
         * @param mask
         *
         * @return false if the bytes returned from the device were not some valid response
         */
        @Override
        public boolean isValid(byte[] backing, int position, int length, int mask) {
            return true;
        }
        
        /**
         * @return The number of hardware pins that this twig uses.
         */
        @Override
        public int pinsUsed() {
            return 1;
        }        
    };
}

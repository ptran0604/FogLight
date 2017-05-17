package com.ociweb.iot.maker;

import com.ociweb.gl.api.Builder;
import com.ociweb.iot.hardware.IODevice;

/**
 * Base interface for an IoT device's hardware.
 * <p>
 * This interface is most commonly used in conjunction with a call
 * to IoTSetup declareConnections in order for
 * a maker's code to declare any hardware connections and resources
 * that it makes use of.
 *
 * @author Nathan Tippy
 */
public interface Hardware extends Builder {

    /**
     * Connects a new {@link IODevice} to this hardware on a given {@link Port}.
     *
     * @param device {@link IODevice} to connect.
     * @param port {@link Port} to connect the device to.
     * @param customRateMS Optional rate in milliseconds to update the device data. TODO: Correct?
     * @param customAvgWinMS Optional rate in milliseconds to sample device data. TODO: Correct?
     * @param everyValue Optional; if set to true, will cause the device to trigger events on every update. TODO: Correct?
     *
     * @return A reference to this hardware instance.
     */
    Hardware connect(IODevice device, Port port, int customRateMS, int customAvgWinMS, boolean everyValue);
    Hardware connect(IODevice device, Port port, int customRateMS, int customAvgWinMS);
    Hardware connect(IODevice device, Port port, int customRateMS);
    Hardware connect(IODevice device, Port port, int customRateMS, boolean everyValue);
    Hardware connect(IODevice device, Port port);

    /**
     * Connects a new I2C {@link IODevice} to this hardware.
     *
     * @param device {@link IODevice} to connect.
     *
     * @return A reference to this hardware instance.
     */
    Hardware connectI2C(IODevice device);

   
    /**
     * Asks this hardware instance to enable I2C communications.
     *
     * @return A reference to this hardware instance.
     */
    Hardware useI2C();
}

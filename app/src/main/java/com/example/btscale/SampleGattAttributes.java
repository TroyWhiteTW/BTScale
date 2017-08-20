package com.example.btscale;

import android.util.Log;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap<>();
    static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static String CUSTOM_SERVICE = "6e400001-b5a3-f393-e0a9-e50e24dcca9e";
    static String READ_CHARACTER = "6e400003-b5a3-f393-e0a9-e50e24dcca9e";
    static String WRITE_CHARACTER = "6e400002-b5a3-f393-e0a9-e50e24dcca9e";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
//        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");

        // test
        attributes.put(CUSTOM_SERVICE, "Service");
        attributes.put(READ_CHARACTER, "Read");
        attributes.put(WRITE_CHARACTER, "Write");
    }

    static String lookup(String uuid, String defaultName) {
        Log.i("troy", "uuid = " + uuid);
        String name = attributes.get(uuid);
        Log.i("troy", "name = " + name);
        return name == null ? defaultName : name;
    }
}

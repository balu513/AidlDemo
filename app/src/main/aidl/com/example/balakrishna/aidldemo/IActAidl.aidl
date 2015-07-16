// IActivityAidl.aidl
package com.example.balakrishna.aidldemo;

// Declare any non-default types here with import statements

interface IActAidl {
  /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
    void sendData(String data);
}

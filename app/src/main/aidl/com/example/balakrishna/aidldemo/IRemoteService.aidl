// IRemoteService.aidl
package com.example.balakrishna.aidldemo;

import com.example.balakrishna.aidldemo.IActAidl;

// Declare any non-default types here with import statements

interface IRemoteService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    void setId(int id);
    int getId();




}

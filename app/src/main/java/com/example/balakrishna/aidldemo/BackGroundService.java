package com.example.balakrishna.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/**
 * Created by balakrishna on 14/5/15.
 */
public class BackGroundService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }


    private final IRemoteService.Stub mBinder = new IRemoteService.Stub() {
    int id;

        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public void setId(int id) throws RemoteException {
            this.id=id;

        }

        @Override
        public int getId() throws RemoteException {
            return 0;
        }
/*
        @Override
        public void setListener(IActivityAidl listener) throws RemoteException
        {

        }*/
    };




}

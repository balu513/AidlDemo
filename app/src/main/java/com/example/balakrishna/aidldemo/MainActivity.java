package com.example.balakrishna.aidldemo;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity implements ServiceConnection {

    private IRemoteService iRemoteService;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, BackGroundService.class);
        bindService(intent, this, BIND_AUTO_CREATE);
        startService(intent);

    }
    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {

        iRemoteService = IRemoteService.Stub.asInterface(service);
        try {
            iRemoteService.setId(100);
            id = iRemoteService.getId();
            System.out.println("id from service:  " + id);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onServiceDisconnected(ComponentName name) {

    }
}

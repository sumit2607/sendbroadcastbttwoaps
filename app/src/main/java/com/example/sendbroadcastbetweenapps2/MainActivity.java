package com.example.sendbroadcastbetweenapps2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
private ReceiverBroadCast receiverBroadCast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiverBroadCast = new ReceiverBroadCast();
        IntentFilter intentFilter = new IntentFilter("Masai.switch.apps");
        registerReceiver(receiverBroadCast,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiverBroadCast);
    }
}
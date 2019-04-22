package com.william.broadcastreceiver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ipDialer(View view) {
        System.out.println("123");
        Intent intent = new Intent(MainActivity.this, IPDialerActivity.class);
        startActivity(intent);
    }

    public void sms(View view) {
        Intent intent = new Intent(MainActivity.this, SmsActivity.class);
        startActivity(intent);
    }

    public void sendBroadcast(View view) {
        Intent intent = new Intent(MainActivity.this, SendBroadcastActivity.class);
        startActivity(intent);
    }

    public void sendOrder(View view) {
        Intent intent = new Intent(MainActivity.this, SendOrderActivity.class);
        startActivity(intent);
    }

    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}

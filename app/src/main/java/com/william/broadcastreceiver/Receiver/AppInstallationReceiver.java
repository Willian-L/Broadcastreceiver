package com.william.broadcastreceiver.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class AppInstallationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            System.out.println("added" + data);
        } else if ("android.intent.action.PACKAGE_INSTALL".equals(action)) {
            System.out.println("install" + data);
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            System.out.println("removed" + data);
        }
    }
}

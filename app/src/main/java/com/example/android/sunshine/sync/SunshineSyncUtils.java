package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

// TODO (9) Create a class called SunshineSyncUtils
public class SunshineSyncUtils
{
public static void startImmediateSync(Context context)
{
     Intent intentService= new Intent(context,SunshineSyncIntentService.class);
     context.startService(intentService);
}


    //  TODO (10) Create a public static void method called startImmediateSync
    //  TODO (11) Within that method, start the SunshineSyncIntentService
}
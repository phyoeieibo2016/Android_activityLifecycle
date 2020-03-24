package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String HOME_ACTIVITY_TAG = MainActivity.class.getSimpleName();

    private void showLog(String text){
        Log.d(HOME_ACTIVITY_TAG, text);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLog("Activity is creating....");
    }

    protected void onRestart(){
        super.onRestart();
        showLog("Activity restarted");
    }

    protected void onStart(){
        super.onStart();
        showLog("Activity is Starting...");
    }

    protected void onResume(){
        super.onResume();
        showLog("Activity Resumed");
    }

    protected void onPause(){
        super.onPause();
        showLog("Activity Paused");
    }

    protected void onStop(){
        super.onStop();
        showLog("Activity Stopped");
    }

    protected void onDestory(){
        super.onDestroy();
        showLog("Activity has been destoryed !");
    }
}

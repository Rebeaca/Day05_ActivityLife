package com.example.user.day05_activitylife.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.user.day05_activitylife.R;

/**
 * Created by user on 2016/11/25.
 */

public abstract class ActivityBase extends AppCompatActivity {
   protected String LOG_NAME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayouyid());
        //初始化属性
        init();
        Log.d("SRL",LOG_NAME+"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SRL",LOG_NAME+"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SRL",LOG_NAME+"onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SRL",LOG_NAME+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SRL",LOG_NAME+"onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SRL",LOG_NAME+"onDestroy");
    }

    //抽象方法，同时需要把类抽象
    protected abstract int getLayouyid();
    protected abstract void init();
}

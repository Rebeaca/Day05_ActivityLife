package com.example.user.day05_activitylife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.day05_activitylife.Activity.ActivityBase;

public class MainActivity_A extends ActivityBase {
private Button next;

    public int getLayouyid(){
        return R.layout.activity_main_a;

    }
    public void init(){
        LOG_NAME="AAAAA";
        next= (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity_A.this,MainActivity_B.class);
                startActivity(intent);
            }
        });

    }



}

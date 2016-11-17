package com.qfxa.butterknifedemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qfxa.butterknifedemo.R;

public class Main3Activity extends AppCompatActivity implements IView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    public void getData(String data) {

    }

    @Override
    public void getData2() {

    }
}

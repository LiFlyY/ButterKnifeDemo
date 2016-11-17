package com.qfxa.butterknifedemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qfxa.butterknifedemo.R;
import com.qfxa.butterknifedemo.presenter.IPresenter;
import com.qfxa.butterknifedemo.presenter.PresenterImpl;

public class Main2Activity extends AppCompatActivity implements IView{

    private IPresenter iPresenter = new PresenterImpl(this);//P对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iPresenter.getUrl(new String());//将url传递给p层
    }

    @Override
    public void getData(String data) {//这里的data拥有数据

    }

    @Override
    public void getData2() {

    }
}

package com.qfxa.butterknifedemo.presenter;

import com.qfxa.butterknifedemo.model.DAta;
import com.qfxa.butterknifedemo.model.IData;
import com.qfxa.butterknifedemo.view.IView;

/**
 * Created by Administrator on 2016/11/17.
 */
public class PresenterImpl implements IPresenter{

    private IView iView = null;
    private IData iData = new DAta(this);//拿到M层对象

    public PresenterImpl(IView iView) {
        this.iView = iView;//V层对象
    }
    
    @Override
    public void getUrl(String url) {

    }

    @Override
    public void getData(String data) {//拿到了从model层传递的数据
        iView.getData(data);
    }
}

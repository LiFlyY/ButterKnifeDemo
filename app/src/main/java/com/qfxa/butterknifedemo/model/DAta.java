package com.qfxa.butterknifedemo.model;

import com.qfxa.butterknifedemo.presenter.IPresenter;
import com.qfxa.butterknifedemo.presenter.PresenterImpl;

/**
 * Created by Administrator on 2016/11/17.
 */
public class DAta implements IData {
    private IPresenter iPresenter = null;

    public DAta(IPresenter iPresenter) {
        this.iPresenter = iPresenter;//拿到P层对象
    }

    @Override
    public void getUrl(String url) {
        String url1 = url ;//得到对应的url
        String data = null;//获取到的data
        iPresenter.getData(data);
    }
}

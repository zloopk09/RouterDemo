package top.zloop.biz.account;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;

import top.zloop.fdn.core.RouterMap;
import top.zloop.fdn.core.UserserviceInterface;

@Route(path= RouterMap.URL_USER_SERVICE)
public class UserserviceImpl implements UserserviceInterface {


    @Override
    public String Hello(String name) {
        return "Welcome "+name;
    }

    @Override
    public void init(Context context) {
        //因为用空构造方法 初始化采用init方式
    }
}

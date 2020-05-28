package top.zloop.biz.account;

import top.zloop.fdn.core.UserserviceInterface;

public class UserserviceImpl implements UserserviceInterface {


    @Override
    public String Hello(String name) {
        return "Welcome "+name;
    }
}

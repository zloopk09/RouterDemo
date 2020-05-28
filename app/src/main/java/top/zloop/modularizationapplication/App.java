package top.zloop.modularizationapplication;

import android.app.Application;

import top.zloop.biz.account.UserActivity;
import top.zloop.biz.login.LoginActivity;
import top.zloop.biz.mail.MailActivity;
import top.zloop.fdn.core.MyRouter;
import top.zloop.fdn.core.RouterMap;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initialRouter();

    }

    private void initialRouter() {
        MyRouter.getInstance().addPath(RouterMap.URL_MAIL, MailActivity.class);
        MyRouter.getInstance().addPath(RouterMap.URL_USER, UserActivity.class);
        MyRouter.getInstance().addPath(RouterMap.URL_Login, LoginActivity.class);
    }
}

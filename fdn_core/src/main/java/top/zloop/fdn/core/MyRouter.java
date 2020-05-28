package top.zloop.fdn.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Chronometer;

import java.util.HashMap;
import java.util.Map;

public class MyRouter {

    private MyRouter(){}

    public MyRouterBuilder build() {
        return new MyRouterBuilder();
    }

    private static class Holder{

        private static MyRouter INSTANCE = new MyRouter();
    }
    public static MyRouter getInstance(){
        return Holder.INSTANCE;
    }

    public void init(Context context){

    }

    private Map<String,Class> map=new HashMap<>();

    public void addPath(String path, Class target) {
        map.put(path,target);
    }


    public void navigate(Context context,String path) {
        Intent intent = new Intent(context, getTarget(path));
        context.startActivity(intent);
    }

    public void navigate(Activity mailActivity, String path, int requestCode) {
        if( getTarget(path)==null ){
            Intent intent = new Intent(mailActivity, getTarget(RouterMap.URL_Login));
            mailActivity.startActivityForResult(intent,requestCode);
            return;
        }
        Intent intent = new Intent(mailActivity, getTarget(path));
        mailActivity.startActivityForResult(intent,requestCode);
    }


    private Class<?> getTarget(String path) {
        return map.get(path);
    }


    public static final class MyRouterBuilder{

    }


}

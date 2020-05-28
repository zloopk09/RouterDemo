package top.zloop.biz.account;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;


@Interceptor(priority = 8, name = "test interceptor")
public class LoginInterceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {

//        if(postcard.getAction()){
//
//        }
        // No problem! hand over control to the framework
        callback.onContinue(postcard);

        // Interrupt routing process
        // callback.onInterrupt(new RuntimeException("Something exception"));

        // The above two types need to call at least one of them, otherwise it will not continue routing
    }

    @Override
    public void init(Context context) {
        // Interceptor initialization, this method will be called when sdk is initialized, it will only be called once
    }
}
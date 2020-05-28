package top.zloop.biz.mail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import top.zloop.fdn.core.RouterMap;
import top.zloop.fdn.core.UserserviceInterface;

//at least two levels : /xx/xx  arouter有组的概念
@Route(path=RouterMap.URL_MAIL)
public class MailActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MailActivity.this, UserActivity.class);
//                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MyRouter.getInstance().navigate(MailActivity.this,RouterMap.URL_USER);
                ARouter.getInstance().build(RouterMap.URL_USER).navigation();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MyRouter.getInstance().navigate(MailActivity.this,RouterMap.URL_USER,100);
                ARouter.getInstance().build(RouterMap.URL_USER).navigation(MailActivity.this,100);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MyRouter.getInstance().navigate(MailActivity.this,RouterMap.URL_USER);
//                增加 with(name,param).with(key,value); 然后再做发送
//                不做演示

//                ARouter.getInstance().build("/test/1")
//                        .withLong("key1", 666L)
//                        .withString("key3", "888")
//                        .withObject("key4", new Test("Jack", "Rose"))
//                        .navigation();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                try {
//                    UserserviceInterface userservice = (UserserviceInterface) MyRouter.getInstance().provide(MailActivity.this,RouterMap.URL_USER_SERVICE).newInstance();
//                    Toast.makeText(MailActivity.this,userservice.Hello("honglian"),Toast.LENGTH_LONG).show();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InstantiationException e) {
//                    e.printStackTrace();
//                }
                UserserviceInterface userservice = (UserserviceInterface) ARouter.getInstance().build(RouterMap.URL_USER_SERVICE).navigation();
                Toast.makeText(MailActivity.this,userservice.Hello("honglian"),Toast.LENGTH_LONG).show();

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MyRouter.getInstance().navigate(MailActivity.this,"RouterMap.URL_Login",100);
                ARouter.getInstance().build("RouterMap.URL_USER").navigation(MailActivity.this,100);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100){
            if(resultCode==RESULT_OK){
                Toast.makeText(MailActivity.this,"onResultOK",Toast.LENGTH_LONG).show();
            }
        }
    }
}

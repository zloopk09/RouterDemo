package top.zloop.biz.mail;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import top.zloop.fdn.core.MyRouter;
import top.zloop.fdn.core.RouterMap;

public class MailActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

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
                MyRouter.getInstance().navigate(MailActivity.this,RouterMap.URL_USER);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyRouter.getInstance().navigate(MailActivity.this,RouterMap.URL_USER,100);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MyRouter.getInstance().navigate(MailActivity.this,RouterMap.URL_USER);
//                增加 with(name,param).with(key,value); 然后再做发送
//                不做演示
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

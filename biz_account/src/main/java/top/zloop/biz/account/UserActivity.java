package top.zloop.biz.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    private Button btn2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        btn2=findViewById(R.id.btn2);
        result=findViewById(R.id.display);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                UserActivity.this.finish();
            }
        });

        if(getIntent().hasExtra("data")){
            result.setText(getIntent().getStringExtra("data")+"");
        }

    }
}

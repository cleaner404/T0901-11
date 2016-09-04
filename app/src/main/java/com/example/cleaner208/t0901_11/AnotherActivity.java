package com.example.cleaner208.t0901_11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final Intent intent=getIntent();
        setContentView(R.layout.activity_another);
        final String user=intent.getStringExtra("user");
        final Integer code=intent.getIntExtra("code",404);
        Toast.makeText(AnotherActivity.this,user+code,Toast.LENGTH_LONG).show();
        Button button=(Button)findViewById(R.id.btn_S);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("result","用户:"+user+"\n"+"密码:"+code);
                setResult(0,intent);
                finish();
            }
        });
    }

}

package com.example.kubra.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
TextView msg;
    String isim,soyisim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        msg= (TextView) findViewById(R.id.msg);

        isim=getIntent().getStringExtra("name");
        soyisim=getIntent().getStringExtra("surname");

        msg.setText("MERHABA "+isim.toUpperCase()+" "+soyisim.toUpperCase());
    }
}

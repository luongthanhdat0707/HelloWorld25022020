package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1: Khai bao biến
    Button mBtnShowAlert ;
    TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2: Ánh xạ
        mBtnShowAlert = findViewById(R.id.iloveu);
        mTvTitle = findViewById(R.id.ulovei);

        // 3: Chạy code
        // 4: In ra tren máy ảo thông báo
        // Toast.makeText(this, "chó vũ", Toast.LENGTH_SHORT).show();
        // built in function
        // Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
//            kiem tra thong tin
//        Log.d ("AAA", a);
//        ctrl + P : Gợi ý tham số truyền vào
        mBtnShowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View view){
        // 간단한 메시지 출력
        Toast.makeText(this, "저는 확인1입니다.", Toast.LENGTH_LONG).show();
    }
}
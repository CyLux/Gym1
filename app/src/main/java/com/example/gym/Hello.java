package com.example.gym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Hello extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
    }
    public void onClickhello(View v){
        Intent a = new Intent(Hello.this, Hello1.class);
        startActivity(a);
        finish();
    }
}

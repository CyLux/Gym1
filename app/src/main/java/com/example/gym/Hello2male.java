package com.example.gym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
//класс отвечающий за переход к шагу 3/5 если выбран мужской пол
public class Hello2male extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello2male);
    }
    public void onClick(View v){
        Intent a = new Intent(Hello2male.this, Hello3.class);
        startActivity(a);
        finish();
    }
}

package com.example.gym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
//класс отвечающий за переход к шагу 3/5 если выбран женский пол
public class Hello2fem extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello2female);
    }
    public void onClickfem(View v){
        Intent b = new Intent(Hello2fem.this, Hello3.class);
        startActivity(b);
        finish();
    }
}

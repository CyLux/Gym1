package com.example.gym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Hello4 extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello4);
    }
    public void onClick(View v){
        Intent a = new Intent(Hello4.this,SignIn.class);
        startActivity(a);

    }
}

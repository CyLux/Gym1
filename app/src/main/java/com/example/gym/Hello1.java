package com.example.gym;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Hello1 extends AppCompatActivity
{
    Button button5,button6,Next;
    Integer score;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello1);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        Next = findViewById(R.id.button7);
    }
    button6.setOnClickListener(new View.OnClickListener() {

    public void onClick(View v) {
        score = 1;
        button6.setBackground(R.drawable.krugenable);
        button5.setBackground(R.drawable.krugenable);
        Next.setBackground();

    }
});
    public void onClickgender(View v){

    }
    public void onClick(View v){

    }
}

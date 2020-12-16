package com.example.gym;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
//класс отвечающий за переход к шагу 4/5 , позволяет выбрать уровень сложности тренировки
public class Hello3 extends AppCompatActivity {
    TextView text_next;
    ImageView newbie, keepon, advanced, bg_next;
    Integer score = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello3);
        text_next = findViewById(R.id.text_next);
        newbie = findViewById(R.id.newbie);
        newbie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                score = 1;
                newbie.setImageResource(R.drawable.btnenable);
                keepon.setImageResource(R.drawable.btn);
                advanced.setImageResource(R.drawable.btn);
                bg_next.setImageResource(R.drawable.btnenable);
                text_next.setTextColor(Color.WHITE);
            }
        });

        keepon = findViewById(R.id.keepon);
        keepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 2;
                keepon.setImageResource(R.drawable.btnenable);
                newbie.setImageResource(R.drawable.btn);
                advanced.setImageResource(R.drawable.btn);
                bg_next.setImageResource(R.drawable.btnenable);
                text_next.setTextColor(Color.WHITE);
            }
        });
        advanced = findViewById(R.id.advanced);
        advanced.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                score = 3;
                newbie.setImageResource(R.drawable.btn);
                keepon.setImageResource(R.drawable.btn);
                advanced.setImageResource(R.drawable.btnenable);
                bg_next.setImageResource(R.drawable.btnenable);
                text_next.setTextColor(Color.WHITE);
            }
        });
        bg_next = findViewById(R.id.bg_next);
        bg_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (score) {
                    case (1):
                        Intent newb = new Intent(Hello3.this, Hello4.class);
                        startActivity(newb);
                        newbie.setImageResource(R.drawable.btn);
                        bg_next.setImageResource(R.drawable.button);
                        text_next.setTextColor(Color.parseColor("#2E70BE"));
                        break;
                    case (2):
                        Intent keep = new Intent(Hello3.this, Hello4.class);
                        startActivity(keep);
                        keepon.setImageResource(R.drawable.btn);
                        bg_next.setImageResource(R.drawable.button);
                        text_next.setTextColor(Color.parseColor("#2E70BE"));
                        break;
                    case (3):
                        Intent adv = new Intent(Hello3.this, Hello4.class);
                        startActivity(adv);
                        advanced.setImageResource(R.drawable.btn);
                        bg_next.setImageResource(R.drawable.button);
                        text_next.setTextColor(Color.parseColor("#2E70BE"));
                        break;
                    default:
                        return;
                }
            }
        });
    }
}

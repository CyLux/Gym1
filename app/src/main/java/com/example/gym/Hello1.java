package com.example.gym;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Hello1 extends AppCompatActivity {
    TextView text_next;
    ImageView bg_male, bg_female, bg_next;
    Integer score = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello1);
        text_next = findViewById(R.id.text_next);
        bg_male = findViewById(R.id.bg_male);
        bg_male.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                score = 1;
                bg_male.setImageResource(R.drawable.krugenable);
                bg_female.setImageResource(R.drawable.krug);
                bg_next.setImageResource(R.drawable.btnenable);
                text_next.setTextColor(Color.WHITE);
            }
        });
        bg_female = findViewById(R.id.bg_female);
        bg_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 2;
                bg_female.setImageResource(R.drawable.krugenable);
                bg_male.setImageResource(R.drawable.krug);
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
                        Intent male = new Intent(Hello1.this, Hello2male.class);
                        startActivity(male);
                        bg_male.setImageResource(R.drawable.krug);
                        bg_next.setImageResource(R.drawable.button);
                        text_next.setTextColor(Color.parseColor("#2E70BE"));
                        break;
                    case (2):
                        Intent female = new Intent(Hello1.this, Hello2fem.class);
                        startActivity(female);
                        bg_female.setImageResource(R.drawable.krug);
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

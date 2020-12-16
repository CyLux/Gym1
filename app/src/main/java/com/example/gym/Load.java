package com.example.gym;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
//класс Launch screen который отвечает за экран который будет показываться при запуске приложения
public class Load extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load);
        //Команда отвечающая за показ активити, 2отвечает за то, сколько секунд будет показываться загрузочный экран
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Load.this, Hello.class);
                startActivity(i);
                finish();
                //команда
            }
        }, 5*600);
    }
}

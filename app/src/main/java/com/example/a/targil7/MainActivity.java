package com.example.a.targil7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    int x;
    Button btn;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        iv = (ImageView) findViewById(R.id.iv);
    }

    public void picswitch(View view) {
        x = rnd.nextInt(3) + 1;
        btn.setText("" + x);
        switch (x) {
            case 1:iv.setImageResource(R.drawable.one);break;
            case 2:iv.setImageResource(R.drawable.two);break;
            case 3:iv.setImageResource(R.drawable.three);break;


        }
    }
}
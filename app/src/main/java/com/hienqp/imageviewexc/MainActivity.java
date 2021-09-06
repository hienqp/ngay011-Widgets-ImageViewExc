package com.hienqp.imageviewexc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout background;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (RelativeLayout) findViewById(R.id.manhinh);
        logo = (ImageView) findViewById(R.id.bieutuong);

        background.setBackgroundResource(R.drawable.background2);
        logo.setImageResource(R.drawable.logo2);
    }
}
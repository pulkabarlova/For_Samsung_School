package com.example.for_samsung_school;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but_n = (Button) findViewById(R.id.nirvana);
        Button but_h = (Button) findViewById(R.id.hole);
        Button but_q = (Button) findViewById(R.id.queen);
        Button but_a = (Button) findViewById(R.id.acdc);
        Button but_g = (Button) findViewById(R.id.ghost);
        ImageView song = (ImageView) findViewById(R.id.song);
        song.setImageResource(R.drawable.nirvana);

        but_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.setImageResource(R.drawable.hole);
            }

        });
        Log.e("hgfghfgf", "onCreate: " );

        but_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.setImageResource(R.drawable.queens);
            }

        });
        but_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.setImageResource(R.drawable.acdc);
            }

        });
        but_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.setImageResource(R.drawable.ghost);
            }

        });
    }
}
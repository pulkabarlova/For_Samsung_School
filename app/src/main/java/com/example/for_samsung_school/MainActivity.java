package com.example.for_samsung_school;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView info = (ImageView) findViewById(R.id.info);
        Button pravo = (Button)findViewById(R.id.button_right);
        Button levo = (Button)findViewById(R.id.button_left);
        ImageView station = findViewById(R.id.station);
        TextView coords = findViewById(R.id.text_home);
        ImageView kometa1 = findViewById(R.id.kometa1);
        TextView timer = findViewById(R.id.timer);
        ImageView kometa2 = findViewById(R.id.kometa2);
        ImageView kometa3 = findViewById(R.id.kometa3);


        pravo.setOnClickListener(v -> {
            station.setX((float) (station.getX() + 20));
            //coords.setX((float) (coords.getX() + 20));
        });
        levo.setOnClickListener(v -> {
            station.setX((float) (station.getX() - 20));
            //coords.setX((float) (coords.getX() - 20));
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog_view1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                dialog.show();
            }
        });

        mHandler.post(new com.example.for_samsung_school.LoopRequestThread(coords, kometa1, kometa2, station, timer, kometa3));


    }
}

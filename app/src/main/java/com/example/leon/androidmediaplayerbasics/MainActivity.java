package com.example.leon.androidmediaplayerbasics;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton playPause = (ToggleButton) findViewById(R.id.playPause);
        Button stopBT = (Button) findViewById(R.id.stop);

        final MediaPlayer mediaPlayer = (MediaPlayer.create(MainActivity.this, R.raw.khalid));

        stopBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });

        playPause.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (playPause.isChecked()) {
                    mediaPlayer.start();
                } else {
                    mediaPlayer.pause();
                }
            }
        });
    }
}

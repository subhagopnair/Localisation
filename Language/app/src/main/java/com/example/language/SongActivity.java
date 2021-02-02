package com.example.language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SongActivity extends AppCompatActivity {

    MediaPlayer dad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        //getting all media player and images for the second page
        dad = MediaPlayer.create(this, R.raw.dad);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        Button btnPause = (Button) findViewById(R.id.pause);
        Intent fromMain = getIntent();
        String message = fromMain.getStringExtra("choice");
        switch (message) {
            case "Dad":
                image.setImageResource(R.drawable.dad);
                dad.start();
                break;

        }
    }

}
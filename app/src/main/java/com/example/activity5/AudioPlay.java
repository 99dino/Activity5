package com.example.activity5;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;

public class AudioPlay extends AppCompatActivity {
    private VideoView audioView;
    private Button playButton;
    private Button pauseButton;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audioplay);
        audioView = findViewById(R.id.audioView);
        playButton = findViewById(R.id.playButton);
        pauseButton = findViewById(R.id.pauseButton);

        // Set the URI for your audio file (replace with your file's path or resource).
        Uri audioUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.imaginedragonsbeliever);

        // Set the audio file's URI to the VideoView.
//        audioView.setVideoURI(audioUri);

        // Create a MediaController to add audio playback controls.
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(audioView);

        // Set the MediaController to the VideoView.
//        audioView.setMediaController(mediaController);

//        // Start the audio playback.
//        audioView.start();
        mediaPlayer = MediaPlayer.create(this, audioUri);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                    playButton.setVisibility(View.GONE);
                    pauseButton.setVisibility(View.VISIBLE);
                }
            }
        });
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    playButton.setVisibility(View.VISIBLE);
                    pauseButton.setVisibility(View.GONE);
                }
            }
        });
    }
    public void back(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}

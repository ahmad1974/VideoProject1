package com.example.ahmad.videoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView goalsVideo;

    public void playVideo(View view){

        RadioButton gameToView = (RadioButton) view;
        int videoId = getResources().getIdentifier(gameToView.getTag().toString(),  "raw", getPackageName());
        goalsVideo.setVideoPath("android.resource://" + getPackageName() + "/" + videoId);
        goalsVideo.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goalsVideo = (VideoView) findViewById(R.id.videoView3);

    }
}

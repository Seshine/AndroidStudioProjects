package com.giri.videoplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class Videoplayurl extends AppCompatActivity {
VideoView vv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayurl);
        vv1 = (VideoView) findViewById(R.id.vv1);

    }
}

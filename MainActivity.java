package com.giri.videoplay;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static android.provider.CalendarContract.CalendarCache.URI;


public class MainActivity extends AppCompatActivity {
    VideoView vv1;
    Button btnplay;
    Button btnstop;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplay = (Button) findViewById(R.id.btnplay);
        btnstop = (Button) findViewById(R.id.btnstop);
        vv1 = (VideoView) findViewById(R.id.vv1);
        Uri uri  = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nagarahavu);
        mediaController = new MediaController(this);
        vv1.setMediaController(mediaController);
        vv1.setVideoURI(uri);
        vv1.start();


    }
}

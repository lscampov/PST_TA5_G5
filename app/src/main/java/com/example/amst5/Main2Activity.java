package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        VideoView videoView1 = (VideoView) findViewById(R.id.videoView);
        videoView1.setMediaController(new MediaController(this));
        videoView1.setVideoURI(Uri.parse("rtsp://r5---sn-q4fl6nss.googlevideo.com/Cj0LENy73wIaNAkgNuM3OtECEhMYDSANFC0tzDVdMOCoAUIASARgv9O56pbF1JVdigELcmlLdjE2SkVYR3MM/8B45813A49C8AD7E22C96C7C1CF0C858C107DE14.A62735FBEF283D568CCE9DAF2DCD9BA33C888872/yt8/1/video.3gp"));
        videoView1.requestFocus();
        videoView1.start();
    }

    public void regresar(View view) {
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }
}

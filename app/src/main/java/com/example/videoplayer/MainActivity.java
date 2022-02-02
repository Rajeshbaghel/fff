package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.FutureTarget;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoview);

//        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.r);
//        mediaPlayer.start();


        //        videoView.setVideoPath("https://bestone-node-test.s3.ap-south-1.amazonaws.com/userUploads/jJQ3nH8W5IJ3o.mp4");
//        videoView.setVideoPath("https://elements.envato.com/man-standing-on-rock-peak-snowy-winter-mountain-ra-E7H9V3K");
//        videoView.start();
//
//       Uri uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/Music/1.mp4");
//        videoView.setVideoURI(uri);
//        videoView.requestFocus();

        //     String mUrl = "https://bestone-node-test.s3.ap-south-1.amazonaws.com/userUploads/jJQ3nH8W5IJ3o.mp4";


        //  Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.r);
//        Uri uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"Kalle Kalle.mp4");
//        videoView.setVideoURI(uri);



//           String mUrl = "https://hdvideo9.com/files/download/id/2890";
      //  String mUrl = "http://hdvideo9.com/files/download/id/2274";
       // String mUrl = "http://hdvideo9.com/files/download/id/2251";
       // String mUrl="https://hdvideo9.com/files/download/type/HD_720p/id/2941";
        String mUrl="https://hdvideo9.com/files/download/id/2560";
      //  String mUrl = "http://hdvideo9.com/files/download/type/HD_720p/id/2905";
        videoView.setVideoPath(mUrl);
        MediaController videoMediaController = new MediaController(this);
        videoMediaController.setMediaPlayer(videoView);
        videoMediaController.setAnchorView(videoView);
        videoView.setMediaController(videoMediaController);
        videoMediaController.requestFocus();

        videoView.start();


    }


}
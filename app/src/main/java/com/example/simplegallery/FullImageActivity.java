package com.example.simplegallery;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    ImageView fullscreenImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        fullscreenImage = (ImageView)findViewById(R.id.fullscreen_image);

        String data = getIntent().getExtras().getString("img");

        fullscreenImage.setImageURI(Uri.parse(data));
    }
}

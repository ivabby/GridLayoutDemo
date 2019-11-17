package com.example.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        int id = view.getId();

        //  Fetch the name of id here which would be the id name of button tapped
        String ourId = view.getResources().getResourceEntryName(id);

        //  Display message on log
        Log.d("Button Tapped" , "Button is " + ourId);

        //  Getting which audio to play
        int resourceId = getResources().getIdentifier(ourId , "raw" , this.getPackageName());
        Log.d("Resource" , "Name "  + resourceId );

        //  MediaPlayer for playing the audio
        MediaPlayer mediaPlayer = MediaPlayer.create(this , resourceId);
        mediaPlayer.start();

    }
}

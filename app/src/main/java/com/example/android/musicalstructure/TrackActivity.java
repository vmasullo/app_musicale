package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Vincenzo on the 4/07/2017.
 */

public class TrackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);


        TextView album = (TextView) findViewById(R.id.album);


        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(TrackActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artist);

        artist.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be called when the artist view is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(TrackActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView playlist = (TextView) findViewById(R.id.playlist);

        playlist.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be called when the playlist view is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(TrackActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}

package com.kistamushken.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindString(R.string.spotify_clicked)
    String spotify;
    @BindString(R.string.scores_app_clicked)
    String scores;
    @BindString(R.string.library_app_clicked)
    String library;
    @BindString(R.string.build_it_bigger_clicked)
    String buildItBigger;
    @BindString(R.string.xyz_reader_clicked)
    String xyzReader;
    @BindString(R.string.my_app_clicked)
    String myApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.spotify_streamer)
    public void onSpotifyClicked() {
        Toast.makeText(this, spotify, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.scores_app)
    public void onScoresAppClicked() {
        Toast.makeText(this, scores, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.library_app)
    public void onLibraryAppClicked() {
        Toast.makeText(this, library, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.build_it_bigger)
    public void onBuildItBiggerClicked() {
        Toast.makeText(this, buildItBigger, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.xyz_reader)
    public void onXyzReaderClicked() {
        Toast.makeText(this, xyzReader, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.capstone_my_app)
    public void onMyAppClicked() {
        Toast.makeText(this, myApp, Toast.LENGTH_SHORT).show();
    }
}

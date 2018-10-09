package com.example.android.newsfeedapp.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.android.newsfeedapp.Helpers.BottomNavigationViewHelper;
import com.example.android.newsfeedapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.bottomNavigationView) BottomNavigationView bottomNavMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Sets the screen to fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView); //Disables the default transaction in the bottom navigation view

        //Sets onClick listeners on the buttons on the bottom navigation view
        bottomNavMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        YoYo.with(Techniques.Tada)
                                .duration(700)
                                .playOn(findViewById(R.id.home));
                        break;

                    case R.id.headline:
                        Intent playListIntent = new Intent(MainActivity.this, HeadlinesActivity.class);
                        startActivity(playListIntent);
                        break;

                    case R.id.favourites:
                        Intent favourtieIntent = new Intent(MainActivity.this, FavouritesActivity.class);
                        startActivity(favourtieIntent);
                        break;

                    case R.id.newsstand:
                        Intent albumIntent = new Intent(MainActivity.this, NewsstandActivity.class);
                        startActivity(albumIntent);
                        break;
                }

                return false;
            }
        });
    }
}
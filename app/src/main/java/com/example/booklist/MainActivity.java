package com.example.booklist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    CardView romantic, biography, comic, horror, cook, science;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        romantic = (CardView)findViewById(R.id.romantic);
        biography = (CardView)findViewById(R.id.biography);
        comic = (CardView)findViewById(R.id.comic);
        horror = (CardView)findViewById(R.id.horror);
        cook = (CardView)findViewById(R.id.cook);
        science = (CardView)findViewById(R.id.science);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawerId);
        navigationView = (NavigationView)findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, romantic.class);
                startActivity(i);
            }
        });
        biography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, biography.class);
                startActivity(i);
            }
        });
        comic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, comic.class);
                startActivity(i);
            }
        });
        horror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, horror.class);
                startActivity(i);
            }
        });
        cook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, cook.class);
                startActivity(i);
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, science.class);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (toggle.onOptionsItemSelected(item)){

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Intent i;

        if(item.getItemId() == R.id.aboutAppMenuId){

            i = new Intent(MainActivity.this, aboutApp.class);
            startActivity(i);

        }
        else if(item.getItemId() == R.id.aboutMeMenuId){

            i = new Intent(MainActivity.this, aboutMe.class);
            startActivity(i);

        }
        return false;
    }
}

package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.homeFrag);
    }

    homeFrag hf = new homeFrag();
    conFrag cf = new conFrag();
    searchFrag sf = new searchFrag();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){

        if (item.getItemId() == R.id.home){
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, hf).commit();
            return true;
        }
        else if (item.getItemId() == R.id.content){
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, cf).commit();
            return true;
        }
        else if (item.getItemId() == R.id.search){
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, sf).commit();
            return true;
        }
        else {
            return false;
        }

    }
}
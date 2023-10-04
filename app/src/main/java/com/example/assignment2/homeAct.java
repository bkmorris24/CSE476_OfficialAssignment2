package com.example.assignment2;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

/**
 * Class that handles the bottom navigation bar, leads to other pages in the app
 */
public class homeAct extends AppCompatActivity implements BottomNavigationView.OnItemSelectedListener{

    // Variable to handle bottom navbar
    BottomNavigationView bottomNavigationView;

    // function that generates the page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.frameLayout);

    }

    // Initialize new fragment objects (destinations to other app pages)
    homeFrag hf = new homeFrag();
    conFrag cf = new conFrag();
    searchFrag sf = new searchFrag();

    // Function that handles the traversal of the app using the navbar
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

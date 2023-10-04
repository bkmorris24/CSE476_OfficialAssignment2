package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

/**
 * Main Activity page, displays the login screen
 */
public class MainActivity extends AppCompatActivity {

    // Function that generates initial screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // button variable to handle the sign in button displayed in activity_main.xml
        Button button = findViewById(R.id.signin);

        // Function that handles the traversal from the sign in page to the homepage of the app
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, homeAct.class);
                startActivity(intent);
            }
        });
    }
}
package com.okeim.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSpotify = (Button) findViewById(R.id.button_spotify);
        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int text = R.string.string_toast_spotify;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonFootballScores = (Button) findViewById(R.id.button_footballscores);
        buttonFootballScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int text = R.string.string_toast_footballscores;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonLibrary = (Button) findViewById(R.id.button_library);
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int text = R.string.string_toast_library;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonBuildIt = (Button) findViewById(R.id.button_builditbigger);
        buttonBuildIt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int text = R.string.string_toast_builditbigger;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonXyzReader = (Button) findViewById(R.id.button_xyzreader);
        buttonXyzReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int text = R.string.string_toast_xyzreader;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonCapstone = (Button) findViewById(R.id.button_capstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int text = R.string.string_toast_capstone;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });



    }


}

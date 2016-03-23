package com.okeim.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays a toast when button is clicked. Picks an
     * unique message according to which button is clicked.
     *
     * @param v {@link View}
     */
    public void showToast(View v) {
        int message;
        Context context = getApplicationContext();

        switch (v.getId()) {
            case R.id.button_spotify:
                message = R.string.string_toast_spotify;
                break;
            case R.id.button_footballscores:
                message = R.string.string_toast_footballscores;
                break;
            case R.id.button_library:
                message = R.string.string_toast_library;
                break;
            case R.id.button_builditbigger:
                message = R.string.string_toast_builditbigger;
                break;
            case R.id.button_xyzreader:
                message = R.string.string_toast_xyzreader;
                break;
            case R.id.button_capstone:
                message = R.string.string_capstone;
                break;
            default:
                message = R.string.string_toast_invalid;
                break;
        }

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();
    }

}

package org.secuso.privacyfriendlypasswordgenerator.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.secuso.privacyfriendlypasswordgenerator.tutorial.TutorialActivity;

/**
 * @author Karola Marky
 * @version 20161022
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent mainIntent = new Intent(SplashActivity.this, TutorialActivity.class);
        SplashActivity.this.startActivity(mainIntent);
        SplashActivity.this.finish();

    }

}

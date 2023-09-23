package com.example.towerclimb;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

// Main activity is the main entry point of our application
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set window to fullscreen (will hide status bar)
        Window window = getWindow();
        window.addFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        //Set content view to game, so that objects in the game class can be render in the screen
        setContentView(new Game(this));

    }
}

package com.example.towerclimb;



import android.graphics.Canvas;
import android.view.Surface;
import android.view.SurfaceHolder;

import java.util.zip.Adler32;

public class GameLoop extends Thread{
    private boolean isRunning = false;
    private SurfaceHolder surfaceHolder;
    private Game game;

    public GameLoop(Game game, SurfaceHolder surfaceHolder) {
        this.game = game;
        this.surfaceHolder = surfaceHolder;
    }


    public double getAverageUPS() {
        return 0;
    }

    public double getAverageFPS() {
        return 0;
    }

    public void startLoop() {
        isRunning = true;
    start();
    }

    @Override
    public void run() {
        super.run();

        //Game loop
        Canvas canvas;
        while (isRunning){
            //try to update and render the game
            canvas = surfaceHolder.lockCanvas();
            game.update();
            game.draw(canvas);
            surfaceHolder.unlockCanvasAndPost(canvas);
            //Pause the game loop to not exceed target UPS

            //skip frames to keep with UPS

            //calculate average UPS and FPS
        }
    }
}

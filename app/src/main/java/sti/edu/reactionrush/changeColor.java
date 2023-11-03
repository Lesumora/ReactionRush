package sti.edu.reactionrush;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class changeColor extends AppCompatActivity {

    Button startBtn, startGame, retry;
    ImageButton back;
    long startTime, endTime, currentTime, second, bestTime = 10000;
    int ranNum;
    TextView bestResult;
    int backPressed = 0, save = (int)bestTime;

    @Override
    public void onBackPressed() {
        backPressed++;
        if(backPressed == 1){
            Toast.makeText(getApplicationContext(), "Press again to go back to Menu", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Press again to go back to Menu", Toast.LENGTH_SHORT).cancel();
        }
        if (backPressed == 2) {
            startActivity(new Intent(changeColor.this, Menu.class));
        } else {
            Log.i("", "onBackPressedElse");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_color);

        int[] androidColors = getResources().getIntArray(R.array.changeColor);
        int changeColor = androidColors[new Random().nextInt(androidColors.length)];

        startGame = (Button) findViewById(R.id.startGame);
        startBtn = (Button) findViewById(R.id.startBtn);
        retry = (Button) findViewById(R.id.retry);
        back = (ImageButton) findViewById(R.id.back);

        startBtn.setEnabled(true);
        startGame.setEnabled(false);

        bestResult = findViewById(R.id.bestResult);
        bestResult.setText("Personal Best: " + second + " second/s");

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBtn.setVisibility(View.GONE);
                startBtn.setEnabled(false);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startTime = System.currentTimeMillis();
                        startGame.setBackgroundColor(changeColor);
                        startGame.setEnabled(true);

                        Random random = new Random();
                        ranNum = random.nextInt(1);
                    }
                }, 2000);
            }
        });

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.bg_5_1));
                startGame.setClickable(false);
                MediaPlayer sfx = MediaPlayer.create(getApplicationContext(), R.raw.sfx);
                sfx.start();
                endTime = System.currentTimeMillis();
                currentTime = endTime - startTime;
                startBtn.setEnabled(false);
                startGame.setEnabled(true);
                bestResult.setVisibility(View.VISIBLE);
                if (currentTime < bestTime) {
                    bestTime = currentTime;
                    second = (bestTime / 1000) % 60;
                    bestResult.setText("Time: " + second + " second/s");
                    bestResult.setAllCaps(false);
                }
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
            }
        });

        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(changeColor.this, changeColor.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(changeColor.this, Menu.class));
            }
        });
    }
}
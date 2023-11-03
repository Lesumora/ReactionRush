package sti.edu.reactionrush;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class findNumber2 extends AppCompatActivity {

    long startTime, endTime, currentTime, second, bestTime = 100000;

    Button retry, startBtn, startGame, next, border, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    TextView bestResult, color;
    ImageButton back;
    int backPressed = 0, save = (int)bestTime;

    @Override
    public void onBackPressed() {
        backPressed++;
        if(backPressed == 1){
            Toast.makeText(getApplicationContext(), "Press again to go back to Menu", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Press again to go back to Menu", Toast.LENGTH_SHORT).cancel();
        }

        if(backPressed == 2){
            startActivity(new Intent(findNumber2.this, Menu.class));
        }else{
            Log.i("", "onBackPressedElse");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_number2);
        border = (Button) findViewById(R.id.startBtn);
        border.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.menu_button2));



        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button9);
        next = (Button) findViewById(R.id.button8);

        retry = (Button) findViewById(R.id.retry);
        back = (ImageButton) findViewById(R.id.back);

        startGame = (Button) findViewById(R.id.startGame);
        startBtn = (Button) findViewById(R.id.startBtn);


        startBtn.setEnabled(true);
        startGame.setEnabled(false);

        color = findViewById(R.id.textView4);
        bestResult = findViewById(R.id.bestResult);
        bestResult.setText("Time: " + bestTime + " ms");

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBtn.setVisibility(View.GONE);
                startBtn.setEnabled(false);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        color.setVisibility(View.VISIBLE);
                        btn1.setVisibility(View.VISIBLE);
                        btn2.setVisibility(View.VISIBLE);
                        btn3.setVisibility(View.VISIBLE);
                        btn4.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.VISIBLE);
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        startGame.setVisibility(View.VISIBLE);
                        startTime = System.currentTimeMillis();
                        startGame.setEnabled(true);
                    }
                }, 3000);
            }
        });

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                startActivity(new Intent(findNumber2.this, findNumber3.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
                startGame.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
                startGame.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
                startGame.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
                startGame.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
                startGame.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
                startGame.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
                startGame.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
                retry.setClickable(true);
                startGame.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
            }
        });

        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(findNumber2.this, Menu.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(findNumber2.this, Menu.class));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(findNumber2.this, findNumber3.class));
            }
        });
    }
}
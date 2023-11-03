package sti.edu.reactionrush;

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

import java.util.ArrayList;
import java.util.Random;

public class findColorRetry4 extends AppCompatActivity {

    RelativeLayout border;
    long startTime, endTime, currentTime, second, bestTime = 100000;

    Button retry, startBtn, startGame, next, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    TextView bestResult, color;
    ImageButton back;
    int backPressed = 0, save = (int)bestTime;

    public static final String pref = "pref";
    final String TEXT = "text";
    String text;

    public void saveScore(){
        SharedPreferences sharedPreferences = getSharedPreferences(pref, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(TEXT, save);
        editor.apply();
    }

    public void loadScore(){
        SharedPreferences sharedPreferences = getSharedPreferences(pref, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
    }

    public void viewScore(){
        bestResult.setText(text);
    }

    @Override
    public void onBackPressed() {
        backPressed++;
        if(backPressed == 1){
            Toast.makeText(getApplicationContext(), "Press again to go back to Menu", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Press again to go back to Menu", Toast.LENGTH_SHORT).cancel();
        }

        if(backPressed == 2){
            startActivity(new Intent(findColorRetry4.this, Menu.class));
        }else{
            Log.i("", "onBackPressedElse");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_color_retry4);
        border = (RelativeLayout) findViewById(R.id.relativeLayout);

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
        startBtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.menu_button2));

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
                        btn1.setBackgroundColor(getResources().getColor(R.color.red));
                        btn2.setBackgroundColor(getResources().getColor(R.color.cyan));
                        btn3.setBackgroundColor(getResources().getColor(R.color.brown));
                        btn4.setBackgroundColor(getResources().getColor(R.color.white));
                        btn5.setBackgroundColor(getResources().getColor(R.color.green));
                        btn6.setBackgroundColor(getResources().getColor(R.color.black));
                        btn7.setBackgroundColor(getResources().getColor(R.color.yellow));
                        btn8.setBackgroundColor(getResources().getColor(R.color.magenta));
                        startGame.setBackgroundColor(getResources().getColor(R.color.blue));
                        startTime = System.currentTimeMillis();
                        startGame.setEnabled(true);
                        border.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.menu_button2));
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
                startGame.setClickable(false);
                btn1.setClickable(false);
                btn2.setClickable(false);
                btn3.setClickable(false);
                btn4.setClickable(false);
                btn5.setClickable(false);
                btn6.setClickable(false);
                btn7.setClickable(false);
                btn8.setClickable(false);
                retry.setVisibility(View.INVISIBLE);
                retry.setClickable(false);
                ArrayList<Class> activityList = new ArrayList<>();
                activityList.add(findColor.class);
                activityList.add(findColor2.class);
                activityList.add(findColor3.class);
                activityList.add(findColorRetry.class);
                activityList.add(findColorRetry2.class);
                activityList.add(findColorRetry3.class);
                activityList.add(findColorRetry4.class);
                activityList.add(findColorRetry5.class);
                activityList.add(findColorRetry6.class);

                Random generator = new Random();
                int number = generator.nextInt(9) + 1;

                Class activity = null;

                switch(number) {
                    case 1:
                        // E.g., if the output is 1, the activity we will open is ActivityOne.class
                        activity = findColor.class;
                        activityList.remove(findColor.class);
                        break;
                    case 2:
                        activity = findColor2.class;
                        activityList.remove(findColor2.class);
                        break;
                    case 3:
                        activity = findColor3.class;
                        activityList.remove(findColor3.class);
                        break;
                    case 4:
                        activity = findColorRetry.class;
                        activityList.remove(findColorRetry.class);
                        break;
                    case 5:
                        activity = findColorRetry2.class;
                        activityList.remove(findColorRetry2.class);
                        break;
                    case 6:
                        activity = findColorRetry3.class;
                        activityList.remove(findColorRetry3.class);
                        break;
                    case 7:
                        activity = findColorRetry4.class;
                        activityList.remove(findColorRetry4.class);
                        break;
                    case 8:
                        activity = findColorRetry5.class;
                        activityList.remove(findColorRetry5.class);
                        break;
                    default:
                        activity = findColorRetry6.class;
                        activityList.remove(findColorRetry6.class);
                        break;
                }
                // We use intents to start activities
                Intent intent = new Intent(getBaseContext(), activity);
                intent.putExtra("ACTIVITY_LIST", activityList);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.setVisibility(View.VISIBLE);
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
                startActivity(new Intent(findColorRetry4.this, Menu.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(findColorRetry4.this, Menu.class));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(findColorRetry4.this, findColor3.class));
            }
        });
    }
}
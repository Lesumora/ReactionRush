package sti.edu.reactionrush;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.ReceiverCallNotAllowedException;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class colorText extends AppCompatActivity {

    RelativeLayout border;
    long startTime, endTime, currentTime, bestTime = 100000;
    long second = (bestTime / 1000) % 60;
    long secondMili, remainder;
    Boolean aBoolean;

    Button retry;
    Button startBtn;
    Button startGame;
    Button next;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    TextView bestResult, color;
    ImageButton back;
    int backPressed = 0, save = (int)bestTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_text);

        border = findViewById(R.id.relativeLayout);
        border.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.menu_button2));
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button9);
        next = findViewById(R.id.button8);

        retry = findViewById(R.id.retry);
        back = findViewById(R.id.back);

        startGame =  findViewById(R.id.startGame);
        startBtn = findViewById(R.id.startBtn);

        startBtn.setEnabled(true);
        startGame.setEnabled(false);
        aBoolean = false;

        color = findViewById(R.id.textView4);
        bestResult = findViewById(R.id.bestResult);
        bestResult.setText("Time: " + second + " second/s");

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBtn.setVisibility(View.GONE);
                startBtn.setEnabled(false);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn1.setVisibility(View.VISIBLE);
                        btn2.setVisibility(View.VISIBLE);
                        btn3.setVisibility(View.VISIBLE);
                        btn4.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.VISIBLE);
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        startGame.setVisibility(View.VISIBLE);
                        btn1.setBackgroundColor(getResources().getColor(R.color.white));
                        btn2.setBackgroundColor(getResources().getColor(R.color.white));
                        btn3.setBackgroundColor(getResources().getColor(R.color.white));
                        btn4.setBackgroundColor(getResources().getColor(R.color.white));
                        btn5.setBackgroundColor(getResources().getColor(R.color.white));
                        btn6.setBackgroundColor(getResources().getColor(R.color.white));
                        btn7.setBackgroundColor(getResources().getColor(R.color.white));
                        btn8.setBackgroundColor(getResources().getColor(R.color.white));
                        startTime = System.currentTimeMillis();
                        startGame.setBackgroundColor(getResources().getColor(R.color.cyan));
                        startGame.setEnabled(true);

                        aBoolean = true;
                    }
                }, 3000);
            }
        });

        if(aBoolean = true){
            startGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer sfx = MediaPlayer.create(getApplicationContext(), R.raw.sfx);
                    sfx.start();
                    startGame.setBackgroundColor(getResources().getColor(R.color.white));
                    btn2.setBackgroundColor(getResources().getColor(R.color.cyan));
                    startGame.setOnClickListener(new View.OnClickListener() {
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

                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer sfx = MediaPlayer.create(getApplicationContext(), R.raw.sfx);
                            sfx.start();
                            btn2.setBackgroundColor(getResources().getColor(R.color.white));
                            btn3.setBackgroundColor(getResources().getColor(R.color.cyan));
                            startGame.setOnClickListener(new View.OnClickListener() {
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

                            btn3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    MediaPlayer sfx = MediaPlayer.create(getApplicationContext(), R.raw.sfx);
                                    sfx.start();
                                    btn3.setBackgroundColor(getResources().getColor(R.color.white));
                                    btn7.setBackgroundColor(getResources().getColor(R.color.cyan));
                                    startGame.setOnClickListener(new View.OnClickListener() {
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

                                    btn7.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            MediaPlayer sfx = MediaPlayer.create(getApplicationContext(), R.raw.sfx);
                                            sfx.start();
                                            btn7.setBackgroundColor(getResources().getColor(R.color.white));
                                            btn8.setBackgroundColor(getResources().getColor(R.color.cyan));
                                            startGame.setOnClickListener(new View.OnClickListener() {
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

                                            btn8.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    btn8.setBackgroundColor(getResources().getColor(R.color.white));
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
                                                        secondMili = second - bestTime;
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
                                                    retry.setVisibility(View.VISIBLE);
                                                    retry.setClickable(true);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
            btn1.setOnClickListener(v -> {
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
            });
            btn2.setOnClickListener(v -> {
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
            });
            btn3.setOnClickListener(v -> {
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
            });
            btn4.setOnClickListener(v -> {
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
            });
            btn5.setOnClickListener(v -> {
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
            });
            btn6.setOnClickListener(v -> {
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
            });
            btn7.setOnClickListener(v -> {
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
            });
            btn8.setOnClickListener(v -> {
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
            });
        }

        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( colorText.this, Menu.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(colorText.this, Menu.class));
            }
        });

    }
}
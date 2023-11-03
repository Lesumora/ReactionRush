package sti.edu.reactionrush;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Menu extends AppCompatActivity {

    Button fc, cc, fn, ct;
    Animation scaleUp, scaleDown;
    ConstraintLayout cl;
    AnimationDrawable cl2;

    int backPressed = 0;

    @Override
    public void onBackPressed() {
        backPressed++;
        if(backPressed == 1){
            Toast.makeText(getApplicationContext(), "Press again to go back", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Press again to go back to Menu", Toast.LENGTH_SHORT).cancel();
        }

        if(backPressed == 2){
            startActivity(new Intent(Menu.this, MainActivity.class));
        }else{
            Log.i("", "onBackPressedElse");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        fc = (Button) findViewById(R.id.button2);
        cc = (Button) findViewById(R.id.button3);
        fn = (Button) findViewById(R.id.button4);
        ct = (Button) findViewById(R.id.button5);

//        cl = findViewById(R.id.menu);
//        cl2 = (AnimationDrawable) cl.getBackground();
//        cl2.setEnterFadeDuration(2000);
//        cl2.setExitFadeDuration(2000);
//        cl2.start();

        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);

        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        fc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    fc.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    fc.startAnimation(scaleDown);
                }

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

                switch (number) {
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

                return true;
            }
        });

        cc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    cc.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    cc.startAnimation(scaleDown);
                }
                startActivity(new Intent(Menu.this, changeColor.class));
                return true;
            }
        });

        fn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    fn.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    fn.startAnimation(scaleDown);
                }
                startActivity(new Intent(Menu.this, findNumber.class));
                return true;
            }
        });

        ct.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ct.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ct.startAnimation(scaleDown);
                }
                startActivity(new Intent(Menu.this, colorText.class));
                return true;
            }
        });

    }
}
package sti.edu.reactionrush;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout fl;
    AnimationDrawable fl_2;
    Button b;
    int backPressed = 0;

    @Override
    public void onBackPressed() {
        backPressed++;
        if(backPressed == 1){
            Toast.makeText(getApplicationContext(), "Press again to Exit", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Press again to go back to Menu", Toast.LENGTH_SHORT).cancel();
        }

        if(backPressed == 2){
            Intent a = new Intent(Intent.ACTION_MAIN);
            a.addCategory(Intent.CATEGORY_HOME);
            a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(a);
            Log.i("", "onBackPressedIf(Pressed_2)");
        }else{
            Log.i("", "onBackPressedElse");
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fl = findViewById(R.id.first_layout);
        fl_2 = (AnimationDrawable) fl.getBackground();
        fl_2.setEnterFadeDuration(2000);
        fl_2.setExitFadeDuration(2000);
        fl_2.start();

        b = findViewById(R.id.first_layout_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Menu.class));
            }
        });
    }
}
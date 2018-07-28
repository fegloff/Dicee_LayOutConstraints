package com.egloffgroup.dicee;

import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Dictionary;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        /*
         adding prefix 'final' makes diceArray variable impossible to change its value, it's a constant
        */
        final int diceArray[] = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","Botton pressed!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee","random: " + number);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[randomNumberGenerator.nextInt(6)]);
            }
        });
    }
}

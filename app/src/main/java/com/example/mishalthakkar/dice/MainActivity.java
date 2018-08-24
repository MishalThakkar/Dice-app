package com.example.mishalthakkar.dice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice,rightDice;
        leftDice = findViewById(R.id.image_leftdice);
        rightDice = findViewById(R.id.image_rightdice);

        final int[] dicearray = {
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
                Log.d("Dice", "button pressed.");

                Random randomnumberGenerator = new Random();

                int number =randomnumberGenerator.nextInt(6);

                int number1 =randomnumberGenerator.nextInt(6);

                Log.d("Dice","The number generated is " + number);

                leftDice.setImageResource(dicearray[number]);

                rightDice.setImageResource(dicearray[number1]);
            }
        });
    }
}

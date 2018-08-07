package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class result1 extends AppCompatActivity {

    int finalResult;
    TextView showMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);

        showMessage = (TextView) findViewById(R.id.result);
        // using the getIntent method to store the Intent that started this Activity in a variable
        Intent intentThatStartedThisActivity = getIntent();
        // check if intent has EXTRA that we passed from "Login activity"
            finalResult = intentThatStartedThisActivity.getIntExtra("final", 0);
            output();

    }
    public void output(){
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_LONG;
        if(finalResult <3)
            text = ("You failed. You scored: "+finalResult + " out of 7");
        else
            showMessage.setText("You passed. You scored: "+ finalResult + " out of 7");
        if(finalResult <3)
            showMessage.setText("You failed. You scored: "+finalResult + " out of 7");
        else
            text = "You passed. You scored: "+ finalResult + " out of 7";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

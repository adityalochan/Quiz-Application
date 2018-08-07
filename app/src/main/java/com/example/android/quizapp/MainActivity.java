package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int finalScore = 0;
    int value =0;
    private EditText ans1;
    private CheckBox ans2Box1, ans2Box2;
    TextView ans3val;
    private RadioButton ans4True, ans4False, ans5True, ans5False, ans6True, ans6False, ans7True, ans7False ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans1 = findViewById(R.id.question1);
        ans2Box1 = (CheckBox) findViewById(R.id.question2Checkbox1);
        ans2Box2 = (CheckBox) findViewById(R.id.question2Checkbox2);
        ans3val = (TextView) findViewById(R.id.question3Value);
        ans4True = (RadioButton) findViewById(R.id.question4True);
        ans4False = (RadioButton) findViewById(R.id.question4False);
        ans5True = (RadioButton) findViewById(R.id.question5True);
        ans5False = (RadioButton) findViewById(R.id.question5False);
        ans6True = (RadioButton) findViewById(R.id.question6True);
        ans6False = (RadioButton) findViewById(R.id.question6False);
        ans7True = (RadioButton) findViewById(R.id.question7True);
        ans7False = (RadioButton) findViewById(R.id.question7False);

    }

    private void scoreCalculator() {
        if(ans1.getText().equals("safe"))
            finalScore++;
        else
            finalScore--;
        if(ans2Box1.isChecked()) {
            finalScore++;
        }
        if(ans2Box2.isChecked()) {
            finalScore++;
        }
        if(ans3val.getText().equals("2")) {
            finalScore++;
        }
        if(ans4True.isChecked()) {
            finalScore++;
        }
        if(ans5False.isChecked()) {
            finalScore++;
        }
        if(ans6True.isChecked()) {
            finalScore++;
        }
        if(ans7False.isChecked()) {
            finalScore++;
        }
    }
    public void decrement(View view){
            value--;
            display(value);
    }
    public void increment(View view){
            value++;
            display(value);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.question3Value);
        displayInteger.setText("" + number);
    }

    public void submit(View view){
        scoreCalculator();
        Intent startLocationActivity = new Intent(MainActivity.this, result1.class);
        startLocationActivity.putExtra("final", finalScore);
        finalScore =0;
        startActivity(startLocationActivity);
    }
}

package com.example.freaksoul.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.widget.EditText;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.*;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;

import static com.example.freaksoul.androidcalculator.R.id.buttonFive;
import static com.example.freaksoul.androidcalculator.R.id.buttonOne;
import static com.example.freaksoul.androidcalculator.R.id.textView1;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button zeroButton;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;
    Button buttonMul;
    Button buttonSum;
    Button buttonDiff;
    Button buttonDiv;
    Button buttonResult;
    Button buttonClear;
    String buttonValue = "";
    float value1;
    float value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.textView1);
        zeroButton = (Button) findViewById(R.id.buttonZero);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonSum = (Button) findViewById(R.id.buttonSum);
        buttonDiff = (Button) findViewById(R.id.buttonDiff);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonResult = (Button) findViewById(R.id.buttonResult);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonOne.setOnClickListener(numberlistener);
        buttonTwo.setOnClickListener(numberlistener);
        buttonThree.setOnClickListener(numberlistener);
        buttonFour.setOnClickListener(numberlistener);
        buttonFive.setOnClickListener(numberlistener);
        buttonSix.setOnClickListener(numberlistener);
        buttonSeven.setOnClickListener(numberlistener);
        buttonEight.setOnClickListener(numberlistener);
        buttonNine.setOnClickListener(numberlistener);
        zeroButton.setOnClickListener(numberlistener);
    }

    private View.OnClickListener numberlistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button sender = (Button) v;
            buttonValue += sender.getText().toString();
            textView1.setText(buttonValue);
            value1 = Float.parseFloat(buttonValue);
        }
    };
}


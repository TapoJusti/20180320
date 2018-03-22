package com.tapojusti.www.a20180320;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button dot;
    private Button plus;
    private Button minus;
    private Button divide;
    private Button multiply;
    private Button equal;
    private Button clear;
    private TextView calculation;
    private TextView result;
    private final char addition = '+';
    private final char subtraction = '-';
    private final char multiplication = '*';
    private final char division = '/';
    private final char equ = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 0);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 6);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 7);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 8);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + 9);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString() + ".");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                action = addition;
                result.setText(String.valueOf(val1) + "+");
                calculation.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                action = subtraction;
                result.setText(String.valueOf(val1) + "-");
                calculation.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                action = division;
                result.setText(String.valueOf(val1) + "/");
                calculation.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                action = multiplication;
                result.setText(String.valueOf(val1) + "*");
                calculation.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                compute();
                action = equ;
                result.setText(result.getText().toString() + String.valueOf(val2) + "="
                + String.valueOf(val1));
                calculation.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (calculation.getText().length() > 0){
                    CharSequence name = calculation.getText().toString();
                    calculation.setText(name.subSequence(0, name.length()-1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    calculation.setText(null);
                    result.setText(null);
                }
            }
        });
    }

    private void setupUIViews(){
       zero = findViewById(R.id.zero);
       one = findViewById(R.id.one);
       two = findViewById(R.id.two);
       three = findViewById(R.id.three);
       four = findViewById(R.id.four);
       five = findViewById(R.id.five);
       six = findViewById(R.id.six);
       seven = findViewById(R.id.seven);
       eight = findViewById(R.id.eight);
       nine = findViewById(R.id.nine);
       dot = findViewById(R.id.dot);
       plus = findViewById(R.id.plus);
       minus = findViewById(R.id.minus);
       divide = findViewById(R.id.divide);
       multiply = findViewById(R.id.multiply);
       equal = findViewById(R.id.equal);
       calculation = findViewById(R.id.calculation);
       result = findViewById(R.id.result);
       clear = findViewById(R.id.clear);
    }

    private void compute() {

        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(calculation.getText().toString());
            switch (action){
                case addition:
                    val1 += val2;
                    break;
                case subtraction:
                    val1 -= val2;
                    break;
                case multiplication:
                    val1 *= val2;
                    break;
                case division:
                    val1 /= val2;
                    break;
                case equ:
                    break;
            }
        } else {
            val1 = Double.parseDouble(calculation.getText().toString());
        }

    }

}

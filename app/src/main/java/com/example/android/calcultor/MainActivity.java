package com.example.android.calcultor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, bu0, buadd, bumins, bumulti, budiv, buclear, budecimalpoint, buequal, buleft, buright;
    TextView numbervwie, operationtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numbervwie = (TextView) findViewById(R.id.textview);
        operationtext = (TextView) findViewById(R.id.textoperation);

        bu0 = (Button) findViewById(R.id.zero);
        bu1 = (Button) findViewById(R.id.one);
        bu2 = (Button) findViewById(R.id.two);
        bu3 = (Button) findViewById(R.id.three);
        bu4 = (Button) findViewById(R.id.four);
        bu5 = (Button) findViewById(R.id.five);
        bu6 = (Button) findViewById(R.id.six);
        bu7 = (Button) findViewById(R.id.seven);
        bu8 = (Button) findViewById(R.id.eight);
        bu9 = (Button) findViewById(R.id.nine);
        buadd = (Button) findViewById(R.id.add);
        bumins = (Button) findViewById(R.id.subtract);
        bumulti = (Button) findViewById(R.id.multii);
        budiv = (Button) findViewById(R.id.dividing);
        buclear = (Button) findViewById(R.id.remove);
        budecimalpoint = (Button) findViewById(R.id.point);
        buequal = (Button) findViewById(R.id.equaal);
        buleft = (Button) findViewById(R.id.left);
        buright = (Button) findViewById(R.id.right);

        bu0.setOnClickListener(this);
        bu1.setOnClickListener(this);
        bu2.setOnClickListener(this);
        bu3.setOnClickListener(this);
        bu4.setOnClickListener(this);
        bu5.setOnClickListener(this);
        bu6.setOnClickListener(this);
        bu7.setOnClickListener(this);
        bu8.setOnClickListener(this);
        bu9.setOnClickListener(this);
        buadd.setOnClickListener(this);
        bumulti.setOnClickListener(this);
        bumins.setOnClickListener(this);
        buequal.setOnClickListener(this);
        budiv.setOnClickListener(this);
        buclear.setOnClickListener(this);
        budecimalpoint.setOnClickListener(this);
        buleft.setOnClickListener(this);
        buright.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        String currentnum = numbervwie.getText().toString();
        String curroperation = operationtext.getText().toString();
        String num1, num2;

        switch (view.getId()) {
            case R.id.one: {
                numbervwie.setText(currentnum + "1");
                break;
            }
            case R.id.two: {
                numbervwie.setText(currentnum + "2");
                break;
            }
            case R.id.remove: {
                numbervwie.setText(currentnum.substring(0, currentnum.length() - 1));
                break;
            }
            case R.id.three: {
                numbervwie.setText(currentnum + "3");
                break;
            }
            case R.id.four: {
                numbervwie.setText(currentnum + "4");
                break;
            }
            case R.id.five: {
                numbervwie.setText(currentnum + "5");
                break;
            }
            case R.id.six: {
                numbervwie.setText(currentnum + "6");
                break;
            }
            case R.id.seven: {
                numbervwie.setText(currentnum + "7");
                break;
            }
            case R.id.eight: {
                numbervwie.setText(currentnum + "8");
                break;
            }
            case R.id.nine: {
                numbervwie.setText(currentnum + "9");
                break;
            }
            case R.id.add: {

                operationtext.setText(curroperation + currentnum + "+");
                numbervwie.setText(null);
                break;

            }

            case R.id.multii: {

                operationtext.setText(curroperation + currentnum + "*");
                numbervwie.setText(null);
                break;
            }
            case R.id.subtract: {
                operationtext.setText(curroperation + currentnum + "-");
                numbervwie.setText(null);

                break;
            }
            case R.id.dividing: {
                operationtext.setText(curroperation + currentnum + "/");
                numbervwie.setText(null);
                break;
            }

            case R.id.equaal: {

                num2 = numbervwie.getText().toString();
                operationtext.setText(curroperation + num2);
                String fulloperation = operationtext.getText().toString();
                double result = Evaluator.evaluate(fulloperation);
                numbervwie.setText(Double.toString(result));
                break;

            }

        }
    }
}
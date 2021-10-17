package com.example.stcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class endMinActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView startMinTxt;
    private ImageButton minBack;
    private ImageButton minForward;
    private Button btnMin00;
    private Button btnMin10;
    private Button btnMin20;
    private Button btnMin30;
    private Button btnMin40;
    private Button btnMin50;
    private Button btnMin0;
    private Button btnMin1;
    private Button btnMin2;
    private Button btnMin3;
    private Button btnMin4;
    private Button btnMin5;
    private Button btnMin6;
    private Button btnMin7;
    private Button btnMin8;
    private Button btnMin9;
    private String minOne;
    private String minOneSet;
    private String minTwo;
    private String minTwoSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_min_layout);
        startMinTxt = findViewById(R.id.endMinTxt);
        minBack = findViewById(R.id.endMinBack);
        minForward = findViewById(R.id.endMinForward);
        btnMin00 = findViewById(R.id.endBtnMin00);
        btnMin00.setOnClickListener(this);
        btnMin10 = findViewById(R.id.endBtnMin10);
        btnMin10.setOnClickListener(this);
        btnMin20 = findViewById(R.id.endBtnMin20);
        btnMin20.setOnClickListener(this);
        btnMin30 = findViewById(R.id.endBtnMin30);
        btnMin30.setOnClickListener(this);
        btnMin40 = findViewById(R.id.endBtnMin40);
        btnMin40.setOnClickListener(this);
        btnMin50 = findViewById(R.id.endBtnMin50);
        btnMin50.setOnClickListener(this);
        btnMin0 = findViewById(R.id.endBtnMin0);
        btnMin0.setOnClickListener(this);
        btnMin1 = findViewById(R.id.endBtnMin1);
        btnMin1.setOnClickListener(this);
        btnMin2 = findViewById(R.id.endBtnMin2);
        btnMin2.setOnClickListener(this);
        btnMin3 = findViewById(R.id.endBtnMin3);
        btnMin3.setOnClickListener(this);
        btnMin4 = findViewById(R.id.endBtnMin4);
        btnMin4.setOnClickListener(this);
        btnMin5 = findViewById(R.id.endBtnMin5);
        btnMin5.setOnClickListener(this);
        btnMin6 = findViewById(R.id.endBtnMin6);
        btnMin6.setOnClickListener(this);
        btnMin7 = findViewById(R.id.endBtnMin7);
        btnMin7.setOnClickListener(this);
        btnMin8 = findViewById(R.id.endBtnMin8);
        btnMin8.setOnClickListener(this);
        btnMin9 = findViewById(R.id.endBtnMin9);
        btnMin9.setOnClickListener(this);
        minOne = "00";
        minTwo = "0";
        minOneSet = minOne.substring(0, minOne.length() - 1) + minTwo;
        if (saver.endGetMin() != null) {
            startMinTxt.setText(saver.endGetMin());
        }else{
            startMinTxt.setText(minOneSet);
        }

        minBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(endMinActivity.this, endHourActivity.class);
                startActivity(intent);
            }
        });
        minForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(endMinActivity.this, STCalendarActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.endBtnMin00:
                minSetter(btnMin00);
                break;
            case R.id.endBtnMin10:
                minSetter(btnMin10);
                break;
            case R.id.endBtnMin20:
                minSetter(btnMin20);
                break;
            case R.id.endBtnMin30:
                minSetter(btnMin30);
                break;
            case R.id.endBtnMin40:
                minSetter(btnMin40);
                break;
            case R.id.endBtnMin50:
                minSetter(btnMin50);
                break;
            case R.id.endBtnMin0:
                minSetterTwo(btnMin0);
                break;
            case R.id.endBtnMin1:
                minSetterTwo(btnMin1);
                break;
            case R.id.endBtnMin2:
                minSetterTwo(btnMin2);
                break;
            case R.id.endBtnMin3:
                minSetterTwo(btnMin3);
                break;
            case R.id.endBtnMin4:
                minSetterTwo(btnMin4);
                break;
            case R.id.endBtnMin5:
                minSetterTwo(btnMin5);
                break;
            case R.id.endBtnMin6:
                minSetterTwo(btnMin6);
                break;
            case R.id.endBtnMin7:
                minSetterTwo(btnMin7);
                break;
            case R.id.endBtnMin8:
                minSetterTwo(btnMin8);
                break;
            case R.id.endBtnMin9:
                minSetterTwo(btnMin9);
                break;

        }
    }

    public void minSetter(Button b) {
        minOne = b.getText().toString();
        minOneSet = minOne.substring(0, minOne.length() - 1) + minTwo;
        saver.endSetMin(minOneSet);
        startMinTxt.setText(minOneSet);

    }

    public void minSetterTwo(Button b) {
        minTwo = b.getText().toString();
        minTwoSet = minOneSet = minOne.substring(0, minOne.length() - 1) + minTwo;
        saver.endSetMin(minTwoSet);
        startMinTxt.setText(minTwoSet);
    }
}
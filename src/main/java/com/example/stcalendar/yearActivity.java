package com.example.stcalendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class yearActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton yearForward;
    private ImageButton yearBack;
    private ImageButton decBtn;
    private ImageButton incBtn;

    private int yrOne;
    private int yrTwo;
    private String partOneYr;

    private TextView startYearTxt;
    private TextView smallYear;
    private TextView bigYear;

    private Button btn00;
    private Button btn10;
    private Button btn20;
    private Button btn30;
    private Button btn40;
    private Button btn50;
    private Button btn60;
    private Button btn70;
    private Button btn80;
    private Button btn90;


    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.year_layout);
        yearForward = (ImageButton) findViewById(R.id.endYearForward);
        yearBack = findViewById(R.id.endYearBack);
        decBtn = findViewById(R.id.decBtn);
        decBtn.setOnClickListener(this);
        incBtn = findViewById(R.id.incBtn);
        incBtn.setOnClickListener(this);
        ///////////////////////////////////////
        startYearTxt = findViewById(R.id.endYearTxt);
        yrOne = 19;
        //startYearTxt.setText(yrOne);
        if(saver.getYear()!=null){
            startYearTxt.setText(saver.getYear());
        }

        ///////////////////////////////////////
        smallYear = findViewById(R.id.smallYear);
        bigYear = findViewById(R.id.bigYear);

        btn00 = findViewById(R.id.endBtn00);
        btn00.setOnClickListener(this);
        btn10 = findViewById(R.id.endBtn10);
        btn10.setOnClickListener(this);
        btn20 = findViewById(R.id.endBtn20);
        btn20.setOnClickListener(this);
        btn30 = findViewById(R.id.endBtn30);
        btn30.setOnClickListener(this);
        btn40 = findViewById(R.id.endBtn40);
        btn40.setOnClickListener(this);
        btn50 = findViewById(R.id.endBtn50);
        btn50.setOnClickListener(this);
        btn60 = findViewById(R.id.endBtn60);
        btn60.setOnClickListener(this);
        btn70 = findViewById(R.id.endBtn70);
        btn70.setOnClickListener(this);
        btn80 = findViewById(R.id.endBtn80);
        btn80.setOnClickListener(this);
        btn90 = findViewById(R.id.endBtn90);
        btn90.setOnClickListener(this);

        btn0 = findViewById(R.id.endBtn0);
        btn0.setOnClickListener(this);
        btn1 = findViewById(R.id.endBtn1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.endBtn2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.endBtn3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.endBtn4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.endBtn5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.endBtn6);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.endBtn7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.endBtn8);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.endBtn9);
        btn9.setOnClickListener(this);

        yearForward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(startYearTxt.getText().length()==4) {

                    Intent intent = new Intent(yearActivity.this, monthActivity.class);
                    startActivity(intent);
                }
            }
        });
        yearBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(yearActivity.this,STCalendarActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.incBtn:
                increment();
                break;
            case R.id.decBtn:
                decrement();
                break;
            case R.id.endBtn00:
                yearChanger(btn00);
                break;
            case R.id.endBtn10:
                yearChanger(btn10);
                break;
            case R.id.endBtn20:
                yearChanger(btn20);
                break;
            case R.id.endBtn30:
                yearChanger(btn30);
                break;
            case R.id.endBtn40:
                yearChanger(btn40);
                break;
            case R.id.endBtn50:
                yearChanger(btn50);
                break;
            case R.id.endBtn60:
                yearChanger(btn60);
                break;
            case R.id.endBtn70:
                yearChanger(btn70);
                break;
            case R.id.endBtn80:
                yearChanger(btn80);
                break;
            case R.id.endBtn90:
                yearChanger(btn90);
                break;

            case R.id.endBtn0:
                yrChangerTwo(btn0);
                break;
            case R.id.endBtn1:
                yrChangerTwo(btn1);
                break;
            case R.id.endBtn2:
                yrChangerTwo(btn2);
                break;
            case R.id.endBtn3:
                yrChangerTwo(btn3);
                break;
            case R.id.endBtn4:
                yrChangerTwo(btn4);
                break;
            case R.id.endBtn5:
                yrChangerTwo(btn5);
                break;
            case R.id.endBtn6:
                yrChangerTwo(btn6);
                break;
            case R.id.endBtn7:
                yrChangerTwo(btn7);
                break;
            case R.id.endBtn8:
                yrChangerTwo(btn8);
                break;
            case R.id.endBtn9:
                yrChangerTwo(btn9);
                break;
        }
    }

    /**
     * This method changes the first two parts of the year.
     * It takes in a Button and assigns the text of the Button as a string to yrTwoStr.
     * The first part of the year is also assigned as a string to yrOneStr. partOne yr is then formed by attaching the two
     * strings. Which is then set as the text for startYear Text.
     * @param b
     */
    public void yearChanger(Button b){
        String yrTwoStr = b.getText().toString();
        String yrOneStr = String.valueOf(yrOne);
        partOneYr = yrOneStr + yrTwoStr;
        startYearTxt.setText(yrOneStr+yrTwoStr);
        saver.setYear(Integer.parseInt(partOneYr));
    }

    /**
     * This method changes the last two substrings of the year
     *
     * @param b
     */
    public void yrChangerTwo(Button b){
        if(startYearTxt.length()>2) {
            String partTwoStr = b.getText().toString();
            partOneYr = partOneYr.substring(0, partOneYr.length() - 1) + partTwoStr;
            startYearTxt.setText(partOneYr);
            saver.setYear(Integer.parseInt(partOneYr));
        }
    }

    public void increment(){
        //Set the current yr
        String currentYrStr = startYearTxt.getText().toString();
        yrOne++;
        currentYrStr = yrOne + currentYrStr.substring(2);
        startYearTxt.setText(currentYrStr);
        //decrement and increment the buttons
        yrTwo = yrOne+1;
        int yrZero = yrOne-1;
        bigYear.setText(String.valueOf(yrTwo));
        smallYear.setText(String.valueOf(yrZero));
        saver.setYear(Integer.parseInt(currentYrStr));
    }
    public void decrement(){
        String currentYrStr = startYearTxt.getText().toString();
        yrOne--;
        currentYrStr = yrOne + currentYrStr.substring(2);
        startYearTxt.setText(currentYrStr);
        //decrement and increment the buttons
        yrTwo = yrOne+1;
        int yrZero = yrOne-1;
        bigYear.setText(String.valueOf(yrTwo));
        smallYear.setText(String.valueOf(yrZero));
        saver.setYear(Integer.parseInt(currentYrStr));
    }



}

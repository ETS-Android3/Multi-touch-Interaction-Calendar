package com.example.stcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class endDateActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView startDateTxt;
    private ImageButton dateForward;
    private ImageButton dateBack;
    private Button btnDate00;
    private Button btnDate10;
    private Button btnDate20;
    private Button btnDate30;
    private Button btnDate0;
    private Button btnDate1;
    private Button btnDate2;
    private Button btnDate3;
    private Button btnDate4;
    private Button btnDate5;
    private Button btnDate6;
    private Button btnDate7;
    private Button btnDate8;
    private Button btnDate9;
    private int tens;
    private int ones;
    private String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_date_layout);
        startDateTxt = findViewById(R.id.startDateTxt);
        dateForward = findViewById(R.id.dateForward);
        dateBack = findViewById(R.id.dateBack);
        btnDate00 = findViewById(R.id.btnDate00);
        btnDate00.setOnClickListener(this);
        btnDate10 = findViewById(R.id.btnDate10);
        btnDate10.setOnClickListener(this);
        btnDate20 = findViewById(R.id.btnDate20);
        btnDate20.setOnClickListener(this);
        btnDate30 = findViewById(R.id.btnDate30);
        btnDate30.setOnClickListener(this);
        btnDate0 = findViewById(R.id.btnDate0);
        btnDate0.setOnClickListener(this);
        btnDate1 = findViewById(R.id.btnDate1);
        btnDate1.setOnClickListener(this);
        btnDate2 = findViewById(R.id.btnDate2);
        btnDate2.setOnClickListener(this);
        btnDate3 = findViewById(R.id.btnDate3);
        btnDate3.setOnClickListener(this);
        btnDate4 = findViewById(R.id.btnDate4);
        btnDate4.setOnClickListener(this);
        btnDate5 = findViewById(R.id.btnDate5);
        btnDate5.setOnClickListener(this);
        btnDate6 = findViewById(R.id.btnDate6);
        btnDate6.setOnClickListener(this);
        btnDate7 = findViewById(R.id.btnDate7);
        btnDate7.setOnClickListener(this);
        btnDate8 = findViewById(R.id.btnDate8);
        btnDate8.setOnClickListener(this);
        btnDate9 = findViewById(R.id.btnDate9);
        btnDate9.setOnClickListener(this);

        tens = 00;
        ones = 1;
        date = tens + String.valueOf(ones).substring(0);
        //startDateTxt.setText(date);
        if(saver.endGetDateStr()!=null){
            startDateTxt.setText(saver.endGetDateStr());
        }else{
            startDateTxt.setText(date);
        }

        dateBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(endDateActivity.this,endMonthActivity.class);
                startActivity(intent);
            }
        });
        dateForward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(endDateActivity.this,endHourActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btnDate00:
                dateSetter(btnDate00);
                break;
            case R.id.btnDate10:
                dateSetter(btnDate10);
                break;
            case R.id.btnDate20:
                dateSetter(btnDate20);
                break;
            case R.id.btnDate30:
                dateSetter(btnDate30);
                break;
            case R.id.btnDate0:
                dateSetterTwo(btnDate0);
                break;
            case R.id.btnDate1:
                dateSetterTwo(btnDate1);
                break;
            case R.id.btnDate2:
                dateSetterTwo(btnDate2);
                break;
            case R.id.btnDate3:
                dateSetterTwo(btnDate3);
                break;
            case R.id.btnDate4:
                dateSetterTwo(btnDate4);
                break;
            case R.id.btnDate5:
                dateSetterTwo(btnDate5);
                break;
            case R.id.btnDate6:
                dateSetterTwo(btnDate6);
                break;
            case R.id.btnDate7:
                dateSetterTwo(btnDate7);
                break;
            case R.id.btnDate8:
                dateSetterTwo(btnDate8);
                break;
            case R.id.btnDate9:
                dateSetterTwo(btnDate9);
                break;

        }
    }

    /**
     * This method sets the bigger part of the date, this includes 00,10,20,and 30.
     * @param b
     */
    public void dateSetter(Button b){
        tens = Integer.parseInt(b.getText().toString());
        date = tens/10+ String.valueOf(ones).substring(0);
        startDateTxt.setText(date);
        saver.endSetDate(Integer.parseInt(date));
    }
    public void dateSetterTwo(Button b){
        ones = Integer.parseInt(b.getText().toString());
        date = tens/10+ String.valueOf(ones).substring(0);
        startDateTxt.setText(date);
        saver.endSetDate(Integer.parseInt(date));
    }

}
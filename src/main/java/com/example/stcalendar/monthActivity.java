package com.example.stcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class monthActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView startMonthTxt;
    private ImageButton monthForward;
    private ImageButton monthBack;
    private Button jan;
    private Button feb;
    private Button mar;
    private Button apr;
    private Button may;
    private Button jun;
    private Button jul;
    private Button aug;
    private Button sep;
    private Button oct;
    private Button nov;
    private Button dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.month_layout);

        startMonthTxt = findViewById(R.id.endMonthTxt);
        if(saver.getMonth()!=null) {
            startMonthTxt.setText(saver.getMonth());
        }
        monthForward = findViewById(R.id.endMonthForward);
        monthBack = findViewById(R.id.endMonthBack);

        jan = findViewById(R.id.janEndButton);
        jan.setOnClickListener(this);
        feb = findViewById(R.id.febEndButton);
        feb.setOnClickListener(this);
        mar = findViewById(R.id.marEndButton);
        mar.setOnClickListener(this);
        apr = findViewById(R.id.aprEndButton);
        apr.setOnClickListener(this);
        may = findViewById(R.id.mayEndButton);
        may.setOnClickListener(this);
        jun = findViewById(R.id.junEndButton);
        jun.setOnClickListener(this);
        jul = findViewById(R.id.julEndButton);
        jul.setOnClickListener(this);
        aug = findViewById(R.id.augEndButton);
        aug.setOnClickListener(this);
        sep = findViewById(R.id.sepEndButton);
        sep.setOnClickListener(this);
        oct = findViewById(R.id.octEndButton);
        oct.setOnClickListener(this);
        nov = findViewById(R.id.novEndButton);
        nov.setOnClickListener(this);
        dec = findViewById(R.id.decEndButton);
        dec.setOnClickListener(this);

        monthForward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(monthActivity.this,dateActivity.class);
                startActivity(intent);
            }
        });
        monthBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(monthActivity.this,yearActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.janEndButton:
                monthSetter(1);
                break;
            case R.id.febEndButton:
                monthSetter(2);
                break;
            case R.id.marEndButton:
                monthSetter(3);
                break;
            case R.id.aprEndButton:
                monthSetter(4);
                break;
            case R.id.mayEndButton:
                monthSetter(5);
                break;
            case R.id.junEndButton:
                monthSetter(6);
                break;
            case R.id.julEndButton:
                monthSetter(7);
                break;
            case R.id.augEndButton:
                monthSetter(8);
                break;
            case R.id.sepEndButton:
                monthSetter(9);
                break;
            case R.id.octEndButton:
                monthSetter(10);
                break;
            case R.id.novEndButton:
                monthSetter(11);
                break;
            case R.id.decEndButton:
                monthSetter(12);
                break;
        }
    }
    public void monthSetter(int count){

        saver.setMonth(count);

        startMonthTxt.setText(saver.getMonth());
    }


}
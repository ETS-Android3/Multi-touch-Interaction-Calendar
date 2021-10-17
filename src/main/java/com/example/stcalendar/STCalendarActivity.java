package com.example.stcalendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class STCalendarActivity extends AppCompatActivity {
    private Button yearBtn;
    private Button endYearBtn;
    private Button monthBtn;
    private Button endMonthBtn;
    private Button dayBtn;
    private Button endDayBtn;
    private TextView weekDay;
    private TextView endWeekDay;
    private Button hourBtn;
    private Button endHourBtn;
    private Button minBtn;
    private Button endMinBtn;
    private ImageButton goBtn;
    private ImageButton mainBack;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stcalendar_layout);
        yearBtn = (Button) findViewById(R.id.yearBtn);
        endYearBtn = (Button) findViewById(R.id.endYearBtn);
        monthBtn = (Button) findViewById(R.id.monthBtn);
        endMonthBtn = (Button) findViewById(R.id.endMonthBtn);
        dayBtn = (Button) findViewById(R.id.dayBtn);
        endDayBtn= (Button) findViewById(R.id.endDayBtn);
        weekDay = (TextView) findViewById(R.id.weekDay);
        endWeekDay = (TextView) findViewById(R.id.endWeekDay);
        hourBtn = (Button) findViewById(R.id.hourBtn);
        endHourBtn = (Button) findViewById(R.id.endHourBtn);
        minBtn = (Button) findViewById(R.id.minBtn);
        endMinBtn = (Button) findViewById(R.id.endMinBtn);
        goBtn = (ImageButton) findViewById(R.id.goBtn);
        mainBack = findViewById(R.id.mainBack);
        if(saver.getYear()!=null){
            saver.dateCreator();
            weekDay.setText(saver.getFullDate());
        }
        if(saver.endGetYear()!=null){
            saver.endDateCreator();
            endWeekDay.setText(saver.endGetFullDate());
        }
        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, yearActivity.class );
                startActivity(intent);
            }
        });
        mainBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, MainActivity.class );
                startActivity(intent);
            }
        });
        yearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, yearActivity.class );
                startActivity(intent);
            }
        });
        monthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, monthActivity.class );
                startActivity(intent);
            }
        });
        dayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, dateActivity.class );
                startActivity(intent);
            }
        });
        hourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, hourActivity.class );
                startActivity(intent);
            }
        });
        minBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, minActivity.class );
                startActivity(intent);
            }
        });
        endYearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, endYearActivity.class );
                startActivity(intent);
            }
        });
        endMonthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, endMonthActivity.class );
                startActivity(intent);
            }
        });
        endDayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, endDateActivity.class );
                startActivity(intent);
            }
        });
        endHourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, endHourActivity.class );
                startActivity(intent);
            }
        });
        endMinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STCalendarActivity.this, endMinActivity.class );
                startActivity(intent);
            }
        });
    }
    public void setYearTxt(){
        weekDay.setText(saver.getFullDate());
    }
}

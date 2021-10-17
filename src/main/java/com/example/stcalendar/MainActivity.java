package com.example.stcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView theDate;
    private Button singleTouchBtn;
    private Button multiTouchBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   
        setContentView(R.layout.activity_main);
        //theDate = (TextView) findViewById(R.id.date);
        singleTouchBtn = (Button) findViewById(R.id.singleTouchBtn);
        multiTouchBtn = (Button) findViewById(R.id.multiTouchBtn);


        singleTouchBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,STCalendarActivity.class);
                startActivity(intent);
            }
        });
        multiTouchBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,MultiTouch.class);
                startActivity(intent);
            }
        });




    }
}
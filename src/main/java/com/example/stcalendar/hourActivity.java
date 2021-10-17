package com.example.stcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class hourActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView startHourTxt;
    private ImageButton hourForward;
    private ImageButton hourBack;
    private Button btnAM;
    private Button btnPM;
    private Button btnHour0 ;
    private Button btnHour1 ;
    private Button btnHour2 ;
    private Button btnHour3 ;
    private Button btnHour4 ;
    private Button btnHour5 ;
    private Button btnHour6 ;
    private Button btnHour7 ;
    private Button btnHour8 ;
    private Button btnHour9 ;
    private Button btnHour10 ;
    private Button btnHour11 ;
    private Button btnHour12 ;
    private String period; // contains the period selected. This value is set to AM at the start unless changed.
    private String selectedHour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hour_layout);
        startHourTxt = findViewById(R.id.endHourTxt);
        hourForward = findViewById(R.id.hourForward);
        hourBack = findViewById(R.id.hourBack);
        btnAM = findViewById(R.id.btnAM);
        btnAM.setOnClickListener(this);
        btnPM = findViewById(R.id.btnPM);
        btnPM.setOnClickListener(this);
        btnHour0 =  findViewById(R.id.endBtnHour0) ;
        btnHour0.setOnClickListener(this);
        btnHour1 =  findViewById(R.id.endBtnHour1);
        btnHour1.setOnClickListener(this);
        btnHour2 =  findViewById(R.id.endBtnHour2);
        btnHour2.setOnClickListener(this);
        btnHour3 =  findViewById(R.id.endBtnHour3);
        btnHour3.setOnClickListener(this);
        btnHour4 =  findViewById(R.id.endBtnHour4);
        btnHour4.setOnClickListener(this);
        btnHour5 =  findViewById(R.id.endBtnHour5);
        btnHour5.setOnClickListener(this);
        btnHour6 =  findViewById(R.id.endBtnHour6);
        btnHour6.setOnClickListener(this);
        btnHour7 =  findViewById(R.id.endBtnHour7);
        btnHour7.setOnClickListener(this);
        btnHour8 =  findViewById(R.id.endBtnHour8);
        btnHour8.setOnClickListener(this);
        btnHour9 =  findViewById(R.id.endBtnHour9);
        btnHour9.setOnClickListener(this);
        btnHour10 =  findViewById(R.id.endBtnHour10);
        btnHour10.setOnClickListener(this);
        btnHour11 =  findViewById(R.id.endBtnHour11);
        btnHour11.setOnClickListener(this);
        btnHour12 =  findViewById(R.id.endBtnHour12);
        btnHour12.setOnClickListener(this);
        selectedHour = "00";
        period = " " + btnAM.getText().toString();
        if(saver.getHour()!=null){
            selectedHour = saver.getHour();
        }
        if(saver.getPeriod()!=null){
            period = " " + saver.getPeriod();
        }
        startHourTxt.setText(selectedHour + period);

        hourForward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(hourActivity.this,minActivity.class);
                startActivity(intent);
            }
        });
        hourBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(hourActivity.this,dateActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.endBtnHour0:
                hourSetter(btnHour0);
                break;
            case R.id.endBtnHour1:
                hourSetter(btnHour1);
                break;
            case R.id.endBtnHour2:
                hourSetter(btnHour2);
                break;
            case R.id.endBtnHour3:
                hourSetter(btnHour3);
                break;
            case R.id.endBtnHour4:
                hourSetter(btnHour4);
                break;
            case R.id.endBtnHour5:
                hourSetter(btnHour5);
                break;
            case R.id.endBtnHour6:
                hourSetter(btnHour6);
                break;
            case R.id.endBtnHour7:
                hourSetter(btnHour7);
                break;
            case R.id.endBtnHour8:
                hourSetter(btnHour8);
                break;
            case R.id.endBtnHour9:
                hourSetter(btnHour9);
                break;
            case R.id.endBtnHour10:
                hourSetter(btnHour10);
                break;
            case R.id.endBtnHour11:
                hourSetter(btnHour11);
                break;
            case R.id.endBtnHour12:
                hourSetter(btnHour12);
                break;
            case R.id.btnAM:
                periodSetter(btnAM);
                break;
            case R.id.btnPM:
                periodSetter(btnPM);
                break;
        }
    }
    /***
     *
     * @param b
     */
    public void hourSetter(Button b){
        if(b.getText().length()<2) {
            selectedHour = "0" + b.getText();
            saver.setHour(selectedHour);
            startHourTxt.setText(selectedHour + period);
        }
        else{
            selectedHour = b.getText().toString();
            saver.setHour(selectedHour);
            startHourTxt.setText(b.getText() + period);
        }
    }
    public void periodSetter(Button b){
        period = " " + b.getText().toString();
        saver.setPeriod(period);
        startHourTxt.setText(selectedHour +period );
    }
}
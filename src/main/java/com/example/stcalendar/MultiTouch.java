package com.example.stcalendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MultiTouch extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener, GestureDetector.OnGestureListener {
    private LinearLayout firstLayout;
    private LinearLayout secondLayout;

    private TextView dateTxt;
    private TextView timeTxt;
    private String day;
    private String month;
    private String year;
    private String min;
    private String hour;
    private String period;
    private View selectedV;

    private GestureDetector mGD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multitouch_layout);
        firstLayout = findViewById(R.id.firstLayout);
        firstLayout.setOnClickListener(this);
        firstLayout.setOnTouchListener(this);
        secondLayout = findViewById(R.id.secondLayout);
        secondLayout.setOnClickListener(this);
        secondLayout.setOnTouchListener(this);

        dateTxt = findViewById(R.id.dateTxt);
        timeTxt = findViewById(R.id.timeTxt);

        dateTimeSetter();

        mGD = new GestureDetector(this,this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.firstLayout:

                break;
            case R.id.secondLayout:

        }
    }
    @Override
    public boolean onTouch(View v, MotionEvent ev){
        mGD.onTouchEvent(ev);
        selectedV = v;
        int pointerIndex = ev.getActionIndex();
        int pointerId = ev.getPointerId(pointerIndex);
        final int actionPeformed = ev.getAction();
        final int pointer = ev.getPointerCount();

        int maskedAction = ev.getActionMasked();
        switch(actionPeformed & maskedAction){
            case MotionEvent.ACTION_MOVE:{
                //pointerDown(pointer);
               // break;
            }
        }
        return false;
    }
    public void dateTimeSetter(){
        //DD/MM/YYYY
        day = "01";
        month = "01";
        year = "1990";
        hour= "00";
        min = "00";
        period = "AM";
        if(saver.getMultiDay()!=null){
            day = saver.getMultiDay();
        }
        if(saver.getMultiMonth()!=null){
            month = saver.getMultiMonth();
        }
        if(saver.getMultiYear()!=null){
            year = saver.getMultiYear();
        }
        if(saver.getMultiMin()!=null){
            min = saver.getMultiMin();
        }
        if(saver.getMultiHour()!=null){
            hour = saver.getMultiHour();
        }
        if(saver.getPeriod()!=null){
            period = saver.getPeriod();
        }
        dateTxt.setText(day+"/"+month+"/"+year);
        timeTxt.setText(hour + ":" + min + " " + period);

    }


    public void pointerDown(int pointer){
        if(pointer==1){
            if(Integer.parseInt(day)>0) {
                //day = String.valueOf(Integer.parseInt(day) - 1);
                day = String.valueOf(Integer.parseInt(day) - 1);
                saver.setMultiDay(day);
                dateTxt.setText(day + "/" + month + "/" + year);

                //dateTxt.setText(day + "/" + month + "/" + year);
            }
        }
        else if(pointer==2){
            if(Integer.parseInt(month)>0){
                month = String.valueOf(Integer.parseInt(month)-1);
                saver.setMultiMonth(month);
                dateTxt.setText(day+"/"+month+"/"+year);
            }
        }
        else if(pointer==3){
            if(Integer.parseInt(year)>0){
                year = String.valueOf(Integer.parseInt(year)-1);
                saver.setMultiYear(year);
                dateTxt.setText(day+"/"+month+"/"+year);
            }
        }
    }
    public void pointerUp( int pointer){
        if(pointer==1){
            if(Integer.parseInt(day)<31) {
                day = String.valueOf(Integer.parseInt(day) + 1);
                saver.setMultiDay(day);
                dateTxt.setText(day + "/" + month + "/" + year);
            }
        }
        else if(pointer==2){
            if(Integer.parseInt(month)<12){
                month = String.valueOf(Integer.parseInt(month)+1);
                saver.setMultiMonth(month);
                dateTxt.setText(day+"/"+month+"/"+year);
            }
        }
        else if(pointer==3){
            if(Integer.parseInt(year)<2030){
                year = String.valueOf(Integer.parseInt(year)+1);
                saver.setMultiYear(year);
                dateTxt.setText(day+"/"+month+"/"+year);
            }
        }
    }
    public void timeUp(int pointer){
        if (pointer == 1) {
            if (Integer.parseInt(hour) < 24) {
                hour = String.valueOf(Integer.parseInt(hour) + 1);
                saver.setMultiHour(hour);
                timeTxt.setText(hour + ":" + min + " " + period);                }
        } else if (pointer == 2) {
            if (Integer.parseInt(min) < 59) {
                min = String.valueOf(Integer.parseInt(min) + 1);
                saver.setMultiMin(min);
                timeTxt.setText(hour + ":" + min + " " + period);                }
        } else if (pointer == 3) {
            if (period=="AM") {
                period = "PM";
            }
            else{
                period = "AM";
            }
            saver.setMultiPeriod(period);
            timeTxt.setText(hour + ":" + min + " " + period);
        }

    }

    /**
     * This method checks when it is scroll down and need to decrease the time.
     * @param pointer
     */

    public void timeDown(int pointer){
        if (pointer == 1) {
            if (Integer.parseInt(hour) > 00) {
                hour = String.valueOf(Integer.parseInt(hour) - 1);
                saver.setMultiHour(hour);
                timeTxt.setText(hour + ":" + min + " " + period);                }
        } else if (pointer == 2) {
            if (Integer.parseInt(min) > 0 ) {
                min = String.valueOf(Integer.parseInt(min) - 1);
                saver.setMultiMin(min);
                timeTxt.setText(hour + ":" + min + " " + period);                }
        } else if (pointer == 3) {
            if (period=="AM") {
                period = "PM";
            }
            else{
                period = "AM";
            }
            saver.setMultiPeriod(period);
            timeTxt.setText(hour + ":" + min + " " + period);
        }
    }





    /**
     * Gesture Detector
     */
    @Override
    public boolean onDown(MotionEvent e) {
        //pointerDown(e.getPointerCount());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        if(selectedV==firstLayout) {
            if (distanceY > 0) {
                //Scrolled Upwards
                    pointerUp(e2.getPointerCount());
            }
            if (distanceY < 0) {
                    pointerDown(e2.getPointerCount());
            }
        }
        else if(selectedV==secondLayout){
            if (distanceY > 0) {
                //Scrolled Upwards
                timeUp(e2.getPointerCount());
                if (e2.getAction() == MotionEvent.ACTION_UP) {
                    //The pointer has gone up, ending the gesture
                }
            }
            if (distanceY < 0) {
                timeDown(e2.getPointerCount());
            }
        }
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
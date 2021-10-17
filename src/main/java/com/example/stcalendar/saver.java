package com.example.stcalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class saver {
    private static String year;
    private static int monthInt;
    private static String monthStr;
    private static int date;
    private static String dateStr;
    private static String hour;
    private static String min;
    private static String period;
    private static String fullDate;

    private static String endYear;
    private static int endMonthInt;
    private static String endMonthStr;
    private static int endDate;
    private static String endDateStr;
    private static String endHour;
    private static String endMin;
    private static String endPeriod;
    private static String endFullDate;

    private static String multiDay;
    private static String multiMonth;
    private static String multiYear;
    private static String multiMin;
    private static String multiHour;
    private static String multiPeriod;


    /**
     * MultiTouch screen setters
     */
    public static void setMultiDay(String day){
        multiDay = day;
    }
    public static void setMultiMonth(String mon){
        multiMonth = mon;
    }
    public static void setMultiYear(String yr){
        multiYear = yr;
    }
    public static void setMultiMin(String min){
        multiMin = min;
    }
    public static void setMultiHour(String hr){
        multiHour = hr;
    }
    public static void setMultiPeriod(String period){
        multiPeriod = period;
    }
    /**
     * MultiTouch screen getter
     */
    public static String getMultiDay(){
        return multiDay;
    }
    public static String getMultiMonth(){
        return multiMonth;
    }
    public static String getMultiYear(){
        return multiYear;
    }
    public static String getMultiMin(){
        return multiMin;
    }
    public static String getMultiHour(){
        return multiHour ;
    }
    public static String getMultiPeriod(){
        return multiPeriod;
    }







    /**
     * Sets the year
     * @param yr
     */
    public static void setYear(int yr){
        year = String.valueOf(yr);
    }

    /**
     * returns the year
     * @return
     */
    public static String getYear(){
        return year;
    }

    /**
     * sets the end year
     * @param yr
     */
    public static void endSetYear(int yr){
        endYear = String.valueOf(yr);
    }

    /**
     * returns the end year
     * @return
     */
    public static String endGetYear(){
        return endYear;
    }

    /**
     * returns the last digit of the year.
     * @return
     */
    public static String getYearlast(){return year.substring(0,year.length()-1);}

    /**
     * returns the last digit of the end year
     * @return
     */
    public static String endYearlast(){return endYear.substring(0,endYear.length()-1);}

    /**
     * Sets the month
     * @param month
     */
    public static void setMonth(int month){
        if(month==1){
            monthInt=1;
            monthStr = "Jan";
        }
        if(month==2){
            monthInt=2;
            monthStr = "Feb";
        }
        if(month==3){
            monthInt=3;
            monthStr = "Mar";
        }
        if(month==4){
            monthInt=4;
            monthStr = "Apr";
        }
        if(month==5){
            monthInt=5;
            monthStr = "May";
        }
        if(month==6){
            monthInt=6;
            monthStr = "Jun";
        }
        if(month==7){
            monthInt=7;
            monthStr = "Jul";
        }
        if(month==8){
            monthInt=8;
            monthStr = "Aug";
        }
        if(month==9){
            monthInt=9;
            monthStr = "Sep";
        }
        if(month==10){
            monthInt=10;
            monthStr = "Oct";
        }
        if(month==11){
            monthInt=11;
            monthStr = "Nov";
        }
        if(month==12){
            monthInt=12;
            monthStr = "Dec";
        }
    }

    /**
     * sets the end month
     * @param month
     */
    public static void endSetMonth(int month){
        if(month==1){
            endMonthInt=1;
            endMonthStr = "Jan";
        }
        if(month==2){
            endMonthInt=2;
            endMonthStr = "Feb";
        }
        if(month==3){
            endMonthInt=3;
            endMonthStr = "Mar";
        }
        if(month==4){
            endMonthInt=4;
            endMonthStr = "Apr";
        }
        if(month==5){
            endMonthInt=5;
            endMonthStr = "May";
        }
        if(month==6){
            endMonthInt=6;
            endMonthStr = "Jun";
        }
        if(month==7){
            endMonthInt=7;
            endMonthStr = "Jul";
        }
        if(month==8){
            endMonthInt=8;
            endMonthStr = "Aug";
        }
        if(month==9){
            endMonthInt=9;
            endMonthStr = "Sep";
        }
        if(month==10){
            endMonthInt=10;
            endMonthStr = "Oct";
        }
        if(month==11){
            endMonthInt=11;
            endMonthStr = "Nov";
        }
        if(month==12){
            endMonthInt=12;
            endMonthStr = "Dec";
        }
    }

    /**
     * returns the month in String
     * @return
     */
    public static String getMonth(){
        return monthStr;
    }

    /**
     * return the month in int
     * @return
     */
    public static int getMonthInt(){
        return monthInt;
    }

    /**
     * returns the end month in String
     * @return
     */
    public static String endGetMonth(){
        return endMonthStr;
    }

    /**
     * returns the end month in int
     * @return
     */
    public static int endGetMonthInt(){
        return endMonthInt;
    }

    /**
     * Sets the date
     * @param d
     */
    public static void setDate(int d){
        date = d;
        dateStr = String.valueOf(date);
    }
    /**
     * Sets the end date
     * @param d
     */
    public static void endSetDate(int d){
        endDate = d;
        endDateStr = String.valueOf(date);
    }

    /**
     * returns the date in int
     * @return
     */
    public static int getDate(){

        return date;
    }
    /**
     * returns the end date in int
     * @return
     */
    public static int endGetDate(){

        return endDate;
    }

    /**
     * returns the date as string
     * @return
     */
    public static String getDateStr(){
        return dateStr;
    }
    /**
     * returns the date as string
     * @return
     */
    public static String endGetDateStr(){
        return endDateStr;
    }

    /**
     * sets the hour
     * @param h
     */
    public static void setHour(String h){
        hour = h;
    }

    /**
     * returns the hour as string
     * @return
     */
    public static String getHour(){
        return hour;
    }

    /**
     * sets the min
     * @param m
     */
    public static void setMin(String m){
        min = m;
    }

    /**
     * sets the period AM/PM
     * @param s
     */
    public static void setPeriod(String s){
        period = s;
    }

    /**
     * returns the period
     * @return
     */
    public static String getPeriod(){
        return period;
    }

    /**
     * returns the min
     * @return
     */
    public static String getMin(){
        return min;
    }

    ////////////////////////////////

    /**
     * sets the end hour
     * @param h
     */
    public static void endSetHour(String h){
        endHour = h;
    }

    /**
     * returns the end hour as string
     * @return
     */
    public static String endGetHour(){
        return endHour;
    }

    /**
     * sets the end min
     * @param m
     */
    public static void endSetMin(String m){
        endMin = m;
    }

    /**
     * sets the end string AM/PM
     * @param s
     */
    public static void endSetPeriod(String s){
        endPeriod = s;
    }

    /**
     * returns the end period
     * @return
     */
    public static String endGetPeriod(){
        return endPeriod;
    }

    /**
     * returns the end min
     * @return
     */
    public static String endGetMin(){
        return endMin;
    }


    ///////////////////////////////

    public static void dateCreator(){
        if(year!=null&&String.valueOf(date)!=null&&monthStr!=null){
            fullDate = date + "/" + monthInt + "/"+ year;
        }
        if(String.valueOf(date)==null){
            date = 0;
        }
        if(monthStr==null){
            monthStr= "Jan";
        }
    }
    public static String getFullDate(){
        return fullDate;
    }

    /**
     * sets the date for the front screen.
     */
    public static void endDateCreator(){
        if(endYear!=null&&String.valueOf(endDate)!=null&&monthStr!=null){
            endFullDate = endDate + "/" + endMonthStr + "/"+ endYear;
        }
        if(String.valueOf(endDate)==null){
            endDate = 0;
        }
        if(endMonthStr==null){
            endMonthStr= "Jan";
        }
    }
    public static String endGetFullDate(){
        return endFullDate;
    }


}

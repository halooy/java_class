package com.Class;



public class TestDate {
    public static void main(String[] args){
        date d1;
        d1 = new date(2020,10,28);
//        d1.SetYear(2020);
//        d1.month = 10;
//        d1.day = 26;
        d1.PrintInfo();
        System.out.println(d1.IsLeapYear());
    }
}

class date{
    int year;
    int month;
    int day;
//    date(){
//        year = 2020;
//        month = 10;
//        day = 28;
//    }
    date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    boolean IsLeapYear(){
        if(year%400==0 || year%4==0 && year%100!=0)
            return true;
        else
            return false;
    }
    void PrintInfo(){
        System.out.println(year+"年"+month+"月"+day+"日");
    }
    void SetYear(int y){
        year = y;
    }
}
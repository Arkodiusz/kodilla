package com.company;

//nazwa parametrów funkcji, zmiennych w konstruktorze i metodach set taka sama
public class Clock {
    private int hour;
    private int minute;
    private int second;

    //constructor
    public Clock(int hour, int minute, int second) {
        this.setTime(hour, minute, second);
    }

    //setters
    public void setHour(int hour) {
        this.hour = hour;
        this.format();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        this.format();
    }

    public void setSecond(int second) {
        this.second = second;
        this.format();
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
        //wywolanie metod: this.set czy set?
        //odwołanie sie do zmiennej wewnatrz metod w klasie - uzywac this.x czy x
        //dziedziczenie
    }

    //getters
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    //inherited methods
    @Override
    public String toString() {
        String s = "";
        if (this.hour < 10) s += 0;
        s += this.hour;
        s += ":";
        if (this.minute < 10) s += 0;
        s += this.minute;
        s += ":";
        if (this.second < 10) s += 0;
        s += this.second;
        return s;
        //czy uzasadnione byłoby uzycie metody getHour i getMinute do odczytu wartości zmiennych?
    }

    //other methods
    public void addSeconds(int seconds) {
        this.second += seconds;
        this.format();
    }

    public void addMinutes(int minutes) {
        this.minute += minutes;
        this.format();
    }

    public void addHours(int hours) {
        this.hour += hours;
        this.format();
    }

    private void format() {
        while (this.second > 59) {
            this.minute++;
            this.second -= 60;
        }
        while (this.minute > 59) {
            this.hour++;
            this.minute -= 60;
        }
        while (this.hour > 23) {
            this.hour -= 24;
        }
    }
}

package com.ds.practice;

public class Interval {

    int start;
    int end;

    Interval(){

    }
    Interval(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

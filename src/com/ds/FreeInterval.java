package com.ds.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FreeInterval {

    public static void main(String[] args) {

        //input={{1,2},{1,3},{} }
        //int[][] input={{1,2},{5,6},{1,3},{4,10}};
        int[][] input={{1,3},{6,7},{2,4},{2,5},{9,12}};
        List intervalLst= convert(input);
        findFreeInterval(intervalLst);


    }

    public static List<Interval> convert(int[][] input){
        List<Interval> intervalLst=new ArrayList<>();
        for(int[] inputs:input){
            Interval interval=new Interval(inputs[0],inputs[1]);
            intervalLst.add(interval);
        }
        return intervalLst;
    }

    public static void findFreeInterval(List<Interval> intervalList){

        intervalList.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        System.out.println(intervalList);



        Interval overlap=intervalList.get(0);
       // Interval  overlap=new Interval();
        for(int i=1;i<intervalList.size();i++){
            //check if overlap, if yes find the new min,max

           Interval x=intervalList.get(i);
           Interval y=intervalList.get(i-1);
           if(y.start>x.end){
               System.out.println("start:"+x.end+" end:"+y.start);
           }
           else if(y.end<x.start){
               System.out.println("start:"+y.end+"end:"+x.start);
           }
        }



    }
}

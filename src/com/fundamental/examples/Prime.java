package com.fundamental.examples;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    private int range,i=0,pr=0;
    private List<Integer> primeList;

    public Prime(int range) {
        this.range = range;
        this.primeList = new ArrayList<Integer>();
    }

    public List<Integer> printPrime(){
        for(i=1;i<range;i++){
            int inc = 0;
            for(pr=i;pr>=1;pr--){
                if(i%pr==0){
                    inc = inc + 1;
                }
            }
            if(inc==2){
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        int mb = 1024 * 1024;

        long startTime = System.currentTimeMillis();

        Prime prime = new Prime(1000000);
        System.out.println("prime = " + prime.printPrime());

        long endTime = System.currentTimeMillis();
        long elapseTime = endTime - startTime;

        System.out.println("elapseTime = " + elapseTime/1000);

        long totalMemory = runtime.totalMemory();
        System.out.println("totalMemory = " + totalMemory/mb+" MB");

        long freeMemory = runtime.freeMemory();
        System.out.println("freeMemory = " + freeMemory/mb+" MB");

        long usedMemory = totalMemory - freeMemory;
        System.out.println("usedMemory = " + usedMemory/mb+" MB");
    }
}

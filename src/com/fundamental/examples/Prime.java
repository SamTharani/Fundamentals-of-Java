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
        Prime prime = new Prime(100);
        System.out.println("prime = " + prime.printPrime().toString());
    }
}

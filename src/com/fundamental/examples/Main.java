package com.fundamental.examples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter the range of numbers = ");
        int n = num.nextInt();
        int i = 0 , pr = 0;
        String writePrime = "";

        for(i=1;i<=n;i++){
            int inc = 0;
            for(pr=i;i>=1;i--){
                if(i%pr==0){
                    inc = inc + 1;
                }
            }
            if(inc==2){
                writePrime = writePrime + i;
            }
        }
        System.out.print("=======>"+writePrime);
    }
}

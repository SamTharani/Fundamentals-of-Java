package com.fundamental.examples;

import java.util.Scanner;

public class GuessNumber {

    private int result;
    private String sign;
    private double ans;

    public void processForGuessNumber()
    {
        System.out.println("=======THIS PROCESS FOR FIND THE UNKNOWN NUMBER======");
        System.out.println("1. Choose a number in your mind ");
        System.out.println("2. Square that number ");
        System.out.println("3. Add double times number with the answer");
        System.out.println("4. Subtract 2 from the answer you got");
        System.out.println("5. Square that answer");
    }

    public void guessNumber(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your answer here: ");
        result = sn.nextInt();
        System.out.print("Number is positive or negative for positive enter + for negative enter - here :");
        sign = sn.next();
        ans = 2*Math.sqrt(result)+2;
        if(sign.equals("+")){
            System.out.println("Number in your mind is "+Math.abs(Math.sqrt(1 + ans)-1));
        }else{
            System.out.println("Number in your mind is "+Math.abs((-1) - Math.sqrt(1 + ans)));
        }
    }

    public void processForGuessAnswer(){
        System.out.println();
        System.out.println("=======THIS PROCESS FOR GUESS THE ANSWER======================");
        System.out.println("1. Choose number between 1 to 10 ");
        System.out.println("2. Multiply that number by 9");
        System.out.println("3. If answer in two digit and those digits else add 0");
        System.out.println("4. Add 4 with that answer");
        System.out.println("5. Finally your answer is 13");
        System.out.println("===============THANK YOU FOR THE PARTICIPATION================");
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}

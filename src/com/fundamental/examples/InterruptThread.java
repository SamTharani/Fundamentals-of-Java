package com.fundamental.examples;


import java.util.concurrent.TimeUnit;

public class InterruptThread extends Thread {

    public InterruptThread(){
        super();
        System.out.println("An instance of the " + InterruptThread.class + " class was created!");
    }

    @Override
    public void run(){
        try{
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException ex){
            System.err.println("An InterruptedException was caught: " + ex.getMessage());

        }
    }

}

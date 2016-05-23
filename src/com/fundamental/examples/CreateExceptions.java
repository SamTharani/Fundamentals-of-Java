package com.fundamental.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateExceptions {
    private static final String FILE_CLASS = "java.util.File";

    public void forFileNotFound() throws FileNotFoundException {
        File file = new File("Documents/fileNotFound.txt");
        FileReader fr = new FileReader(file);
    }

    public void forOutOfBounds() {
        /*int numArray[] = new int[10];
        for(int i=0; i<20;i++){
            numArray[i] = i;
        }*/
        String ex = "exceptions";
        for (int i = 0; i <= ex.length(); i++) {
            System.out.println(ex.substring(i, i + 1));
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(2 * i);
        }
        System.out.println(list.get(15));
    }

    public void forNullPointer(Integer num) {
        int value = num.intValue();
        System.out.println("value = " + value);

    }

    public void forIllegalArgument() {
        Age age = new Age(105);
        age.getAge();

    }

    public int forArithmetic(int num1, int num2) {

        if (num2 <= 0) {
            throw new ArithmeticException();
        }
        int output = num1 / num2;
        return output;

    }

    public void forNumberFormat() {
        try {
            int num = Integer.parseInt("EXCEPTION");
            System.out.println("num = " + num);
        } catch (NumberFormatException e) {
            System.err.println("An error occurred since " + e.getMessage());
        }
    }

    public void forClassNotFound() {

        try {
            Class loadedClass = Class.forName(FILE_CLASS);
            System.out.println("Class " + loadedClass + " found successfully!");
        } catch (ClassNotFoundException ex) {
            System.err.println("A ClassNotFoundException was caught: " + ex.getMessage());
            // ex.printStackTrace();

        }

    }

    public void forIllegalAccess() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("exception 1");
        Iterator iterator = stringList.iterator();
        Method method = null;
        try {
            method = iterator.getClass().getMethod("hasNext");
            System.out.println(method.invoke(iterator));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void forInterrupt(){
        Thread thread = new InterruptThread();
        thread.start();
        thread.interrupt();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void forClassCast(){
        try{
            Object num = 10;
            System.out.println("num = " + (String)num);

        }catch (ClassCastException ex){
            System.err.println("A ClassCastException was caught: " + ex.getMessage());
        }

    }


    public static void main(String[] args) throws FileNotFoundException {
        Integer num = null;
        CreateExceptions ce = new CreateExceptions();
        //ce.forFileNotFound();
        //ce.forOutOfBounds();
        // ce.forNullPointer(num);
        //ce.forIllegalArgument();
        /*int result = ce.forArithmetic(20, -1);
        System.out.println("result = " + result);*/
        //ce.forNumberFormat();
        // ce.forClassNotFound();
        //ce.forIllegalAccess();
        //ce.forInterrupt();
        ce.forClassCast();
    }
}

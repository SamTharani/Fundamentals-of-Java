package com.fundamental.examples;


import java.io.*;
import java.util.Random;

public class GenerateNumberInFile {

    private int number;

    public static void main(String[] args) {
        GenerateNumberInFile file = new GenerateNumberInFile();
        file.generate();
    }
    public void generate() {

        try {
            PrintWriter file = new PrintWriter(new FileWriter("random.txt"));
            Random rand = new Random();
            for(int i=0;i<200000;i++){
                number = rand.nextInt(100000);
                file.write(number+"\n");
            }
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

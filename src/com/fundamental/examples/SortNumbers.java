package com.fundamental.examples;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortNumbers {

    List<Integer> numlist;
    String line;

    public SortNumbers() {
        this.numlist = new ArrayList<Integer>();
        line = null;
    }

    public static void main(String[] args) throws IOException {
        SortNumbers sortNumbers = new SortNumbers();
        sortNumbers.generateNumbers("output.txt", 100);
        List<Integer> numlist1 = sortNumbers.sortNumbers("output.txt");
        sortNumbers.writNumbersInAscending("ascendingOrder.txt", numlist1);
        sortNumbers.writNumbersInAscending("descendingOrder.txt", numlist1);
    }

    public List<Integer> sortNumbers(String fileName) throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        while ((line = bf.readLine()) != null) {
            String numArray[] = line.split("\n");

            for (String aNumArray : numArray) {
                numlist.add(Integer.parseInt(aNumArray));
            }
        }
        bf.close();
        Collections.sort(numlist);
        return numlist;
    }

    public void generateNumbers(String fileName, int range) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(fileName));
            Random random = new Random();
            for (int i = 0; i < range; i++) {
                writer.println(random.nextInt(range));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writNumbersInAscending(String fileName, List<Integer> numlist) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(fileName));
            for (Integer aNumlist : numlist) {
                writer.println(aNumlist + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writNumbersInDescending(String fileName, List<Integer> numlist) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(fileName));
            for (int i = numlist.size(); i > 0; i--) {
                writer.println(numlist.get(i) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

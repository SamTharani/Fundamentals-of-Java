package com.fundamental.examples;

public class Main {

    public static void main(String[] args) {

        //Method 1==============>

        /*Scanner num = new Scanner(System.in);
        System.out.print("Enter the range of numbers = ");
        int n = num.nextInt();
        int i = 0, pr = 0;
        String writePrime = "";
        List<Integer> primeList = new ArrayList();

        for (i = 1; i < n; i++) {
            int inc = 0;
            for (pr = i; pr >= 1; pr--) {
                if (i % pr == 0) {
                    inc = inc + 1;
                }
            }
            if (inc == 2) {
                writePrime = writePrime + i + " ";
            }
        }
        System.out.print(writePrime);


        //Method 2 =====>Print prime numbers in a list

        for (i = 1; i < n; i++) {
            int inc = 0;
            for (pr = i; pr >= 1; pr--) {
                if (i % pr == 0) {
                    inc = inc + 1;
                }
            }
            if (inc == 2) {
                primeList.add(i);
            }
        }
        for (int k = 0; k < primeList.size(); k++) {
            System.out.print(primeList.get(k) + " ");
        }


        //Method 3=====> Using prime class print prime
        Prime primeRange = new Prime(n, primeList);
        List<Integer> outputList = primeRange.printPrime();
        for (int k = 0; k < outputList.size(); k++) {
            System.out.print(primeList.get(k) + " ");
        }
*/

        /*Enter the range of numbers = 100
        2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97*/


        //Test Guess Number

        GuessNumber guessNumber = new GuessNumber();
        guessNumber.processForGuessNumber();
        guessNumber.guessNumber();
        guessNumber.processForGuessAnswer();
    }
}

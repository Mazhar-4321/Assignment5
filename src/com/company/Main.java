package com.company;

import java.util.Scanner;

public class Main {
    final static int Q1 = 1;
    final static int Q3 = 3;
    final static int Q7 = 7;
    final static int Q8 = 8;
    final static int Q9 = 9;
    final int OFFSET_VALUE = 1;
    final int POWER_LIMIT = 30;

    public static void main(String[] args) {
        System.out.println("Basic Core Java Programs");
        Main main = new Main();
        System.out.println("Enter 1 for Flip Coin ,3 for Power of 2 ,7 for swap two numbers,8 for Even Or Odd ,9 for Alphabet is Vowel or Consonant" +
                " ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case Q1:
                int flipNumber = scanner.nextInt();
                main.findPercentageOfHeadAndTailsOfNFlipCoins(flipNumber);
                break;
            case Q3:
                int N = scanner.nextInt();
                main.printPowerOf2(N);
                break;
            case Q7:
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                main.swapTwoNumbers(num1, num2);
                break;
            case Q8:
                int evenOrOdd = scanner.nextInt();
                main.isEven(evenOrOdd);
                break;
            case Q9:
                String word=scanner.next().toLowerCase();
                if(word.length()>1){
                    System.out.println("Invalid Input");
                    return;
                }
                char alphabet = word.charAt(0);
                main.isAlphabetVowel(alphabet);
                break;
        }
    }

    public void isAlphabetVowel(char alphabet) {
        String message = "Consonant";
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                message = "Vowel";
            default:
                break;
        }
        System.out.println("Alphabet is " + message);
    }

    public void findPercentageOfHeadAndTailsOfNFlipCoins(int flipNumber) {
        double[] headAndTailPercentage = new double[2];
        int count = flipNumber;
        while (flipNumber-- >= OFFSET_VALUE) {
            double randomNumber = Math.random();
            headAndTailPercentage[randomNumber > 0.5 ? 0 : 1] += 1;
        }
        System.out.println("Head Percentage=" + headAndTailPercentage[0] / count + ",Tail Percentage=" + headAndTailPercentage[1] / count);
    }

    public void printPowerOf2(int N) {
        if (N > POWER_LIMIT) {
            return;
        }
        int i = 0;
        while (i++ != N) {
            System.out.println((int) Math.pow(2, i));
        }
    }

    public void swapTwoNumbers(int num1, int num2) {
        System.out.println(" Before Swap num1=" + num1 + ",num2=" + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap num1=" + num1 + ",num2=" + num2);
    }

    public void isEven(int num) {
        System.out.println("Even=" + (num % 2 == 0 ? true : false));
    }
}

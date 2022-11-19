package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    final static int Q1 = 1;
    final static int Q3 = 3;
    final static int Q7 = 7;
    final static int Q8 = 8;
    final static int Q9 = 9;
    final static int Q10 = 10;
    final static int Q6 = 6;
    final static int Q5 = 5;
    final static int Q2 = 2;
    final static int Q4 = 4;
    final static int MIN_LEAP_YEAR_LIMIT = 1000;
    final static int FOUR = 4;
    final static int FOUR_CENTURY = 400;
    final static int ZERO = 0;
    final static int CENTURY = 100;
    final int OFFSET_VALUE = 1;
    final int POWER_LIMIT = 30;

    public static void main(String[] args) {
        System.out.println("Basic Core Java Programs");
        Main main = new Main();
        System.out.println("Enter 1 for Flip Coin ,3 for Power of 2 ,7 for swap two numbers,8 for Even Or Odd ,9 for Alphabet is Vowel or Consonant" +
                "10 for Largest Among Three Numbers,6 for Quotient And Remainder,5 for Prime factors 2 for Leap Year 4 for Nth Harmonic Number ");
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
                char alphabet = scanner.next().toLowerCase().charAt(0);
                main.isAlphabetVowel(alphabet);
                break;
            case Q10:
                int firstNumber = scanner.nextInt();
                int secondNumber = scanner.nextInt();
                int thirdNumber = scanner.nextInt();
                main.findLargestAmongThreeNumbers(firstNumber, secondNumber, thirdNumber);
                break;
            case Q6:
                int number = scanner.nextInt();
                main.findQuotientAndRemainder(number);
                break;
            case Q5:
                number = scanner.nextInt();
                main.findPrimeFactors(number);
                break;
            case Q2:
                number = scanner.nextInt();
                main.isLeapYear(number);
                break;
            case Q4:
                number = scanner.nextInt();
                main.printNthHarmonicNumber(number);
                break;

        }
    }

    public void printNthHarmonicNumber(int number) {
        if(number<OFFSET_VALUE){
            System.out.println("Invalid Number");
            return;
        }
        double nthHarmonicNumber = 1;
        while (number >= OFFSET_VALUE) {
            nthHarmonicNumber /= number;
            number -= 1;
        }
        System.out.println("Nth Harmonic Number=" + nthHarmonicNumber);
    }

    public void isLeapYear(int number) {
        if (number < MIN_LEAP_YEAR_LIMIT) {
            System.out.println("Invalid number");
            return;
        }
        if ((number % FOUR == ZERO && number % CENTURY != ZERO) || (number % FOUR == ZERO && number % CENTURY == ZERO && number % FOUR_CENTURY == 0)) {
            System.out.println("Leap Year");
            return;
        }
        System.out.println("Non Leap Year");
    }

    public void findPrimeFactors(int number) {
        int i = 1;
        while (i * i <= number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i += 1;
        }
    }

    public void findQuotientAndRemainder(int number) {
        System.out.printf("Quotient=%d,Remainder=%d", number / 10, number % 10);
    }

    public void findLargestAmongThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.printf("Third Largest Number among %d,%dand %d is %d", firstNumber, secondNumber, thirdNumber, firstNumber >= secondNumber
                && firstNumber >= thirdNumber ? firstNumber : (secondNumber >= thirdNumber ? secondNumber : thirdNumber));
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
        if (flipNumber < OFFSET_VALUE) {
            System.out.println("Invalid Number");
            return ;
        }
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

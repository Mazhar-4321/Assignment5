package com.company;

import java.util.Scanner;

public class Main {
    final int OFFSET_VALUE = 1;

    public static void main(String[] args) {
        System.out.println("Basic Core Java Programs");
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int flipNumber = scanner.nextInt();
        double[] headAndTailPercentage = main.findPercentageOfHeadAndTailsOfNFlipCoins(flipNumber);
        System.out.println("Head Percentage=" + headAndTailPercentage[0] + ",Tail Percentage=" + headAndTailPercentage[1]);
    }

    public double[] findPercentageOfHeadAndTailsOfNFlipCoins(int flipNumber) {
        if (flipNumber < OFFSET_VALUE) {
            System.out.println("Invalid Number");
            return null;
        }
        double[] headAndTailPercentage = new double[2];
        int count = flipNumber;
        while (flipNumber-- >= OFFSET_VALUE) {
            double randomNumber = Math.random();
            headAndTailPercentage[randomNumber > 0.5 ? 0 : 1] += 1;
        }
        headAndTailPercentage[0] = headAndTailPercentage[0] / count;
        headAndTailPercentage[1] = headAndTailPercentage[1] / count;
        return headAndTailPercentage;
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userInputNumber = readUserInputNumber();
        String [][] pyramid = createPyramid(userInputNumber);
        printPyramid(pyramid);
    }

    public static final String WELCOME_MESSAGE = "\n----- " +
            "Welcome to the Pyramid Pattern Program!" +
            " -----\n" +
            "\n" +
            "Please add an integer number: ";

    public static void printWelcomeMessage() {
        System.out.print(WELCOME_MESSAGE);
    }

    public static int readUserInputNumber() {
        Scanner inputScan = new Scanner(System.in);
        printWelcomeMessage();
        return inputScan.nextInt();
    }

    public static String[][] createPyramid(int userInputNumber) {
        final int ADJUST_IN_LINE_LENGTH = userInputNumber + 2;

        String[][] pyramid = new String[userInputNumber][ADJUST_IN_LINE_LENGTH];

        for (int i = 0; i < pyramid.length; i++) {
            for (int j = pyramid[i].length - 1; j >= pyramid[i].length - 1 - i; j--) {
                pyramid[i][j] = " *";
            }
            for (int j = 0; j < pyramid[i].length - 1 - i; j++) {
                pyramid[i][j] = " ";
            }
        }
        return pyramid;
    }

    public static void printPyramid(String[][] pyramid) {
        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j]);
            }
            System.out.print('\n');
        }
    }

}






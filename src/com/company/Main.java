package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printWelcomeMessage();
        boolean isRunning = true;
        Scanner inputScan = new Scanner(System.in);

        do {
            int userInputNumber = readUserInputNumber(inputScan);
            String [][] pyramid = createPyramid(userInputNumber);
            printPyramid(pyramid);
            isRunning = setProgramContinuity(inputScan);
        } while (isRunning);

    }

    static final String WELCOME_MESSAGE = "----- " +
            "Welcome to the Pyramid Pattern Program!" +
            " -----";

    static final String ADD_NUMBER = "\nPlease add an integer number: ";

    static final String CONTINUITY_MESSAGE = "Cool, right? =)\n" +
            "Do you want to see another pyramid with a different entry number? " +
            "\n" +
            "Enter Y for yes or N for no: ";

    public static void printWelcomeMessage() {
        System.out.println(WELCOME_MESSAGE);
    }

    public static void printAddNumberMessage() {
        System.out.print(ADD_NUMBER);
    }

    public static void printContinuityMessage() {
        System.out.println(CONTINUITY_MESSAGE);
    }

    public static int readUserInputNumber(Scanner inputScan) {
        printAddNumberMessage();
        return inputScan.nextInt();
    }

    public static String[][] createPyramid(int userInputNumber) {
        int LINE_LENGTH = userInputNumber;
        int ADJUST_IN_COLUMN_LENGTH = userInputNumber + 2;

        String[][] pyramid = new String[LINE_LENGTH][ADJUST_IN_COLUMN_LENGTH];

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
        System.out.print('\n');
        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j]);
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public static boolean setProgramContinuity(Scanner inputScan) {
        printContinuityMessage();
        return Objects.equals(inputScan.next(), "Y");
    }

}






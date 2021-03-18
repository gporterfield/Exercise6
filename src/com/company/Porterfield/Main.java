package com.company.Porterfield;

import java.util.InputMismatchException;
import java.util.Scanner;

class UserInput {

    public static String checkInt(String userInput) {
        Scanner scanner = new Scanner(System.in);

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
                if (isInt == true) {
                    System.out.println("Incorrect datatype entered (INTEGER).");
                    userInput = scanner.nextLine();
                    checkInt(userInput);

                }
            } catch (NumberFormatException e) {
                break;

            }
        }
        return userInput;
    }

    public static String checkDouble(String userInput) {
        Scanner scanner = new Scanner(System.in);

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
                if (isDouble == true) {
                    System.out.println("Incorrect datatype entered (DOUBLE).");
                    userInput = scanner.nextLine();
                    checkInt(userInput);
                    checkDouble(userInput);

                }
            } catch (NumberFormatException e) {
                break;

            }


        }
        return userInput;
    }

    public String promptString(String message) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String userInput = scanner.nextLine();
        checkInt(userInput);
        checkDouble(userInput);
        System.out.println("You entered the String: " + userInput);

        return message;
    }
}

public class Main {

    public static void promptInt() {

        int message;

        System.out.println("Please enter an integer: ");

        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                message = input.nextInt();
                input.nextLine();
                System.out.println("You entered an integer of: " + message);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data type entered.");


            } catch (Exception e) {
                System.out.println("Something went wrong!");


            }
        }
    }

    public static void promptDouble() {

        double message;

        System.out.println("Please enter a double: ");

        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                message = input.nextDouble();
                input.nextLine();
                System.out.println("You entered a double of: " + message);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data type.");


            } catch (Exception e) {
                System.out.println("Something went wrong!");


            }
        }
    }

    public static void main(String[] args) {

        UserInput input = new UserInput();


        input.promptString("Enter a String: ");
        promptInt();
        promptDouble();

    }
}

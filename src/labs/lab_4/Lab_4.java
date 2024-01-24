package labs.lab_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        //Get input to generate a random array
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Please input a valid number: ");
            scanner.next();
        }
        int expectedArrLength = scanner.nextInt();
        System.out.print("Input the maximum number of the random range: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Please input a valid number: ");
            scanner.next();
        }
        int maxRange = scanner.nextInt();

        //Random the value
        Random randomIntNumbers = new Random();
        int[] intArr = new int[expectedArrLength];
        int arrLength = intArr.length;
        for (int randomIndex = 0; randomIndex < arrLength; randomIndex++) {
            intArr[randomIndex] = randomIntNumbers.nextInt(maxRange);
        }

        boolean isContinueing = true;
        while (isContinueing){
            //Show menu
            System.out.println("=====MENU======");
            System.out.println("1. Print all numbers");
            System.out.println("2. Print maximum value");
            System.out.println("3. Print minimum value");
            System.out.println("4. Search number");
            System.out.println("5. Exit");

            System.out.println("Input a number to select the option: ");
            int userOption = scanner.nextInt();

            //1. Print all numbers
            if (userOption == 1) {
                System.out.println("All numbers in the array here " + Arrays.toString(intArr));
                System.out.println("\nWhat do you want next?");
            }

            //2. Print maximum value
            if (userOption == 2) {
                int maxValue = intArr[0];
                for (int index = 1; index < intArr.length; index++) {
                    if (maxValue < intArr[index]) {
                        maxValue = intArr[index];
                    }
                }
                System.out.println("Max value is " + maxValue);
                System.out.println("\nWhat's do you want next?");
            }

            //3. Print minimum value
            if (userOption == 3) {
                int minValue = intArr[0];
                for (int index = 1; index < intArr.length; index++) {
                    if (minValue > intArr[index]) {minValue = intArr[index];}
                }
                System.out.println("Min value is " + minValue);
                System.out.println("\nWhat do you want next?");
            }

            //4. Search number
            if (userOption == 4) {
                //Get user input the number to search
                System.out.println("Which number do you want to search for? ");
                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a number!");
                    System.out.println("Please input a valid number: ");
                    scanner.next();
                }
                int userSearchingNumber = scanner.nextInt();
                //If it is greater the random range, print result, else start search
                if (userSearchingNumber > maxRange){
                    System.out.println("Cannot find out! The searching number is outbound of the list.");
                    System.out.println("\nWhat do you want next? ");
                } else {
                    boolean hasResult = false;
                    for (int index = 0; index < arrLength; index++) {
                        if (userSearchingNumber == intArr[index]) {
                            hasResult = true;
                            System.out.println("The search number is in the list and the position is " + (index + 1));
                            System.out.println("\nWhat do you want next? ");
                            break;
                        }
                    }
                    if (hasResult == false) {
                        System.out.println("Search no result! No searching number in the list");
                        System.out.println("\nWhat do you want next? ");
                    }
                }
            }

            //5. Exit
            if (userOption == 5) {
                isContinueing = false;
                System.out.println("Thank you! \n See you.");
            }
        }
    }
}

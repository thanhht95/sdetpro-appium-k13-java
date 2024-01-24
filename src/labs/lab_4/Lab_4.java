package labs.lab_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        //Get input to generate a random array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the expected length of the Array: ");
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
        do {
            printMenu();
            int userOption = getUserOption();

            //1. Print all numbers
            switch (userOption) {
                case 1: {
                    printAllNumbers(intArr);
                    break;
                }

                //2. Print maximum value
                case 2: {
                    printMaxNumber(intArr);
                    break;
                }

                //3. Print minimum value
                case 3: {
                    printMinNumber(intArr);
                    break;
                }

                //4. Search number
                case 4: {
                    searchNumber(intArr, maxRange);
                    break;
                }

                //5. Exit
                case 5: {
                    isContinueing = false;
                    System.out.println("Thank you! \n See you.");
                    break;
                }
                default:
                    System.out.println("That's not a listed option, here's the menu: ");
            }
        }  while (isContinueing);
    }


    public static void printMenu() {
        //Show menu
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit");
    }

    public static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        //Let the user select option
        System.out.println("Input a corresponding number to select the option: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Please input a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void printAllNumbers (int [] intArr){
        System.out.println("All numbers in the array here " + Arrays.toString(intArr));
        System.out.println("\nWhat do you want next?");
    }

    public static void printMaxNumber (int [] intArr){
        int maxValue = intArr[0];
        for (int index = 1; index < intArr.length; index++) {
            if (maxValue < intArr[index]) {
                maxValue = intArr[index];
            }
        }
        System.out.println("Max value is " + maxValue);
        System.out.println("\nWhat's do you want next?");
    }

    public static void printMinNumber (int [] intArr){
        int minValue = intArr[0];
        for (int index = 1; index < intArr.length; index++) {
            if (minValue > intArr[index]) {
                minValue = intArr[index];
            }
        }
        System.out.println("Min value is " + minValue);
        System.out.println("\nWhat do you want next?");
    }

    public static void searchNumber(int[] intArr, int maxRange){
        Scanner scanner = new Scanner(System.in);
        //Get user input the number to search
        System.out.println("Which number do you want to search for? ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Please input a valid number: ");
            scanner.next();
        }
        int userSearchingNumber = scanner.nextInt();
        //If it is greater the random range, print result, else start search
        if (userSearchingNumber > maxRange) {
            System.out.println("Cannot find out! The searching number is outbound of the generated list.");
            System.out.println("\nWhat do you want next? ");
        } else {
            boolean hasResult = false;
            for (int index = 0; index < intArr.length; index++) {
                if (userSearchingNumber == intArr[index]) {
                    hasResult = true;
                    System.out.println("The search number " + userSearchingNumber + " is in the list and the position is " + (index + 1));
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

}

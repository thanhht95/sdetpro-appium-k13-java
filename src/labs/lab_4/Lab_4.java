package labs.lab_4;

import java.util.*;

public class Lab_4 {
    public static void main(String[] args) {
        //Get input to generate a random array
        System.out.print("Input the expected length of the Array: ");
        int expectedArrLength = getUserInputANumber();

        System.out.print("Input the maximum number of the random range: ");
        int maxRange = getUserInputANumber();

        //Random the value
        List<Integer> intArr = randomArrayListValue(expectedArrLength,maxRange);

        boolean isContinueing = true;
        do {
            printMenu();
            System.out.println("Input a corresponding number to select the option: ");
            int userOption = getUserInputANumber();
            switch (userOption) {
                //1. Print all numbers
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

    public static int getUserInputANumber(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Please input a valid number: ");
            scanner.next();
        }
        int userInputNumber = scanner.nextInt();
        validatePositiveNumber(userInputNumber);
        return userInputNumber;
    }

    public static void validatePositiveNumber(int userInputNumber){
        if (userInputNumber < 1) {
            System.out.println("Please input a number greater than 0: ");
            getUserInputANumber();
        }
    }

    public static List<Integer> randomArrayListValue (int expectedArrLength, int maxRange){
        Random randomIntNumbers = new Random();
        List<Integer> intArr = new ArrayList<>();
        for (int indexToRandom = 0; indexToRandom < expectedArrLength; indexToRandom++) {
            intArr.add(randomIntNumbers.nextInt(maxRange));
        }
        return intArr;
    }

    public static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit");
    }

    public static void printAllNumbers (List<Integer> intArr){
        System.out.println("All numbers in the array here " + intArr);
        System.out.println("\nWhat do you want next?");
    }

    public static void printMaxNumber (List<Integer> intArr){
        int maxValue = intArr.get(0);
        for (int index = 1; index < intArr.size(); index++) {
            if (maxValue < intArr.get(index)) {
                maxValue = intArr.get(index);
            }
        }
        System.out.println("Max value is " + maxValue);
        System.out.println("\nWhat's do you want next?");
    }

    public static void printMinNumber (List<Integer> intArr){
        int minValue = intArr.get(0);
        for (int index = 1; index < intArr.size(); index++) {
            if (minValue > intArr.get(index)) {
                minValue = intArr.get(index);
            }
        }
        System.out.println("Min value is " + minValue);
        System.out.println("\nWhat do you want next?");
    }

    public static void searchNumber(List<Integer> intArr, int maxRange){
        //Get user input the number to search
        System.out.println("Which number do you want to search for? ");
        int userSearchingNumber = getUserInputANumber();
        //If it is greater the random range, print result, else start search
        if (userSearchingNumber > maxRange) {
            System.out.println("Cannot find out! The searching number is outbound of the generated list.");
            System.out.println("\nWhat do you want next? ");
        } else {
            boolean hasResult = false;
            for (int index = 0; index < intArr.size(); index++) {
                if (userSearchingNumber == intArr.get(index)) {
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

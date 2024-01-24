package labs.lab_3;

import java.util.Random;
import java.util.Scanner;

public class Lab_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the expected length of the Array: ");
        int expectedArrLength = scanner.nextInt();
        System.out.print("Input the maximum number of the random range: ");
        int maxRange = scanner.nextInt();

        //Random the given array with input length
        Random randomIntNumbers = new Random();
        int[] intArr = new int[expectedArrLength];
        int arrLength = intArr.length;
        System.out.print("The random array here: [");
        for (int randomIndex = 0; randomIndex < arrLength; randomIndex++) {
            intArr[randomIndex] = randomIntNumbers.nextInt(maxRange);
            System.out.print(intArr[randomIndex] + " ");
        }
        System.out.println("]");

        //Loop the list to count the number of even
        int numbersOfEven = 0;
        for (int number = 0; number < arrLength; number++){
            if (intArr[number]%2 == 0) numbersOfEven++;
        }
        //The number of odd
        int numbersOfOdd = arrLength - numbersOfEven;

        System.out.println("Even numbers: " + numbersOfEven);
        System.out.println("Odd numbers: " + numbersOfOdd);
    }
}

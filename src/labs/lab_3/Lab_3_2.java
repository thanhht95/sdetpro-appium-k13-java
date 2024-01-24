package labs.lab_3;

import java.util.Random;
import java.util.Scanner;

public class Lab_3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the expected length of the Array: ");
        int expectedArrLength = scanner.nextInt();
        System.out.print("Input the maximum number of the random range: ");
        int maxRange = scanner.nextInt();

        //Random the value
        Random randomIntNumbers = new Random();
        int[] intArr = new int[expectedArrLength];
        int arrLength = intArr.length;
        System.out.print("The random array here: [");
        for (int randomIndex = 0; randomIndex < arrLength; randomIndex++) {
            intArr[randomIndex] = randomIntNumbers.nextInt(maxRange);
            System.out.print(intArr[randomIndex] + " ");
        }
        System.out.println("]");

        //Loop the array to assign the min, max value
        int minValue = intArr[0];
        int maxValue = intArr[0];
        for (int index = 1; index < intArr.length; index++) {
            if (minValue > intArr[index]) {minValue = intArr[index];}
            else maxValue = intArr[index];
            }
        System.out.println("Min value is " + minValue);
        System.out.println("Max value is " + maxValue);
    }
}

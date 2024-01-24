package labs.lab_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_3_3 {
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

        //Loop and swap with Bubble sort
        int unsortedPosition = arrLength - 1;
        for (;unsortedPosition>0;unsortedPosition--){
            for (int index = 0; index < unsortedPosition; index++){
                int leftValue = intArr[index];
                int rightValue = intArr[index + 1];
                //int temp;
                if (leftValue > rightValue) {
                    int temp = leftValue;
                    intArr[index] = intArr[index + 1];
                    intArr[index + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}

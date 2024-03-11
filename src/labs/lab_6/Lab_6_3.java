package labs.lab_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String userInput = scanner.nextLine();
        List<Integer> numberFromStr = new ArrayList<>();
        char[] charArray = userInput.toCharArray();
        String numbers;
        for (char character: charArray){
            if(Character.isDigit(character)){
                numberFromStr.add(Integer.valueOf(String.valueOf(character)));
            }
        }
        System.out.println("Digits in the input string " + numberFromStr);
    }
}

package labs.lab_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_6_1 {
    public static void main(String[] args) {
        String givenString = "2hrs and 5 minutes";
        List<Integer> numberFromStr = new ArrayList<>();
        int convertingToMinutes;
        char[] charArray = givenString.toCharArray();
        for (char character: charArray){
            if(Character.isDigit(character)){
                numberFromStr.add(Integer.valueOf(String.valueOf(character)));
            }
        }
        convertingToMinutes=numberFromStr.get(0)*60+numberFromStr.get(1);
        System.out.println("Total minutes is " + convertingToMinutes);
    }
}

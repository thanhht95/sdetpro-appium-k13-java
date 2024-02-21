package labs.lab_6;

import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myPassword = "password123";

        System.out.println("Please input your password: ");
        int maxAttempts = 3;
        int wrongAttempts = 0;
        while (wrongAttempts < 3) {
           if (myPassword.equals(scanner.next())) {
               System.out.println("Correct Password!");
               break;
           } else
           {
               wrongAttempts++;
               System.out.printf("Incorrect Password! You have %d time(s) left to try \n", maxAttempts - wrongAttempts);
           }
       }
        if (wrongAttempts == 3) System.out.println("You have input wrong many times, please try again later!");
    }
}

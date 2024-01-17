package labs.lab_2;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập 1 số nguyên vào: ");
        int number = scanner.nextInt();
        //Check odd or even
        if (number%2 == 0) {
            System.out.println("Đây là 1 số chẵn");
        }
        else {
            System.out.println("Đây là 1 số lẻ");
        }
    }
}

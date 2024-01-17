package labs.lab_2;

import java.util.Scanner;

public class Lab_2_1_and_3 {
    public static void main(String[] args) {
        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Chiều cao của bạn (m): ");
        float height = scanner.nextFloat();
        System.out.print("Nhập Cân nặng của bạn (kg): ");
        float weight = scanner.nextFloat();
        //Calculate BMI and ideal weight
        float BMI = weight / (height*2);
        System.out.println("Vậy chỉ số BMI của bạn là: " + BMI);
        float maxWeight = (height%1)*100;
        float minWeight = (height%1)*100*8/10;
        //Evaluate result
        //Underweight
        if (BMI < 18.5) {
            System.out.printf("Bạn trong tình trạng thiếu cân, hãy tăng thêm %.2f kg nữa nhé \n", minWeight - weight);
        }
        //Normal
        else if (BMI <= 24.5) {
            System.out.println("Chỉ số BMI của bạn trong mức bình thường");
        }
        else {
            //Overweight
            if (BMI <= 29.9) {
                System.out.printf("Bạn trong tình trạng thừa cân, hãy giảm %.2f kg nhé \n", weight - maxWeight);
            }
            //Obesity
            else {
                System.out.printf("Bạn trong tình trạng béo phì, cần giảm %.2f kg nhé \n", weight - maxWeight);
            }
        }
    }
}

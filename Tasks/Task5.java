package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int input1, input2, input3;
        System.out.println("Enter three integers: ");
        input1 = input.nextInt();
        input2 = input.nextInt();
        input3 = input.nextInt();
        int[] numbers = { input1, input2, input3 };

        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            System.out.println("All numbers are equal.");
        } else {
            int largest = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }
            System.out.println("The largest number is: " + largest);
        }
        input.close();
    }
}

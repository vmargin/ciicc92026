import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int largest = input;

        for (int i = 2; i <= 3; i++) {
            input = sc.nextInt();
            if (input > largest) {
                largest = input;
            }   
        }
        System.out.println(largest);
        sc.close();
    }
}
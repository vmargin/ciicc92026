import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            int input = scan.nextInt();
            sum += input;
        }

        System.out.println(sum);
        scan.close();
    }
}

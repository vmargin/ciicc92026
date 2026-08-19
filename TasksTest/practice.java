import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of repetitions: ");
        int reps = scan.nextInt();
        if (reps == 0) {
            System.out.println("Input number 0 is invalid");
        } else {
            System.out.println("input numbers");
            int input = scan.nextInt();
            int largest = input;

            for (int i = 2; i <= reps; i++) {
                int input2 = scan.nextInt();
                if (input2 > largest) {
                    largest = input2;
                }
            }
            System.out.println(largest);
            scan.close();
        }
    }
}

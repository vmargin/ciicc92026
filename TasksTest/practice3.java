import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input repetition:");
        int reps = scan.nextInt();

        int largestEven = 0;
        boolean foundEven = false;

        System.out.println("Input " + reps + " numbers:");

        for (int i = 1; i <= reps; i++) {
            int input = scan.nextInt();

            if (input % 2 == 0) {
                if (!foundEven || input > largestEven) {
                    largestEven = input;
                    foundEven = true;
                }
            }
        }

        if (foundEven) {
            System.out.println("Largest even number: " + largestEven);
        } else {
            System.out.println("No even numbers were entered.");
        }

        scan.close();
    }
}
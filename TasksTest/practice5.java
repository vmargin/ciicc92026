import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of reps: ");
        int reps = scan.nextInt();

        for (int i = 1; i <= reps; i++) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                line += i;
            }
            System.out.println(line);
        }

        scan.close();
    }

}
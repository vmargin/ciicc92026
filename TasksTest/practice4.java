import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Numbers: ");
        int input = scan.nextInt();
        int largest = input;

        while (input != 0 ) {
            if (input > largest) {
                largest = input;
            }
            input = scan.nextInt();

        }
        System.out.println("Largest: " + largest);
        scan.close();
    }

}
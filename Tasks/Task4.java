package Tasks;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringBuilder input1 = new StringBuilder(scanner.nextLine());
        input1.reverse();
        System.out.println("Reversed string: " + input1);

        while (true) {
            System.out.println("Enter a string (or 'quit' to exit): ");
            String scanner2 = scanner.nextLine();
            if (scanner2.equals("quit")) {
                break;
            }
            StringBuilder input2 = new StringBuilder(scanner2).reverse();
            System.out.println("Reversed string: " + input2);
            if (scanner2.equals(input2.toString())) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }
        }
        scanner.close();
    }

}

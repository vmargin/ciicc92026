import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        if (input.equals(sb.reverse().toString())) {
            System.out.println("Is a palindrome");

        } else {
            System.out.println("Is not a palindrome");
        }
        sc.close();

    }
}

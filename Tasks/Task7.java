package Tasks;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input:");
        System.out.print("Enter first number: " );
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum =input.nextInt();
        // int addAnswer = addTwoNum(firstNum, secondNum);
        System.out.println("Output:");
        System.out.println("Sum: "+ add(firstNum, secondNum));
        System.out.println("Difference: "+ sub(firstNum, secondNum));
        System.out.println("Product: "+ multiply(firstNum, secondNum));
        System.out.println("Quotient: "+ divide(firstNum, secondNum));
        input.close();
    }

    public static int add(int firstNum, int secondNum) {
        return firstNum + secondNum; 
    }

    public static int sub(int firstNum, int secondNum) {
        return firstNum - secondNum;

    }

    public static int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int divide(int firstNum, int secondNum) {
        if (secondNum == 0) {
            System.out.println("Invalid, cannot be divided by 0");
            return 0;
        }
        return firstNum / secondNum;
    }
}

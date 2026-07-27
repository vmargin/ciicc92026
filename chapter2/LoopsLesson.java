package chapter2;

import java.util.Scanner;

public class LoopsLesson {
    public static void main(String[] args) {

        int a = 1;
        while (a <= 10) {
            System.out.println("a = " + a++);
        }

        byte b = 1;
        while (b <= 10) {
            System.out.println("b = " + b++);
        }

        for (int c = 0; c < 10; c++) {
            System.out.println("c = " + c);
        }

        Scanner q = new Scanner(System.in);
        System.out.print("Enter a valid number: ");
        int limit = q.nextInt();

        for (int x = 1; x <= limit; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        String[] colors = {"black", "red", "pink", "yellow", "white", "blue"};
        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        for (int p = 1; p <= 10; p++) {
            for (int l = 1; l <= 10; l++) {
                System.out.print(p * l + "\t");
            }
            System.out.println();
        }

        q.close();
    }
}
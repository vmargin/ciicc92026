package chapter2;

import java.util.Scanner;

public class LoopsLesson {
    public static void main(String[] args) {
        int a = 1;
        while (a<=10) {
            System.out.println("a = " + a++);


        }

        byte b = 1; // infinite loop
        while (b <= 10) {
            System.out.println("b = " + b--);
            
        }

        for (int c = 0; c < 10; c++) { //for loop, can exist without init, update statement
            System.out.println("c = " + c);
            
        }
        // nest for loop
        Scanner q = new Scanner;
        int limit = q.nextInt();
        System.out.println("Enter a valid num");
        for(int x=1; limit; x++) {
            for(int y=1; y<=x; y++);

        }
        // for each
        String[] colors = {"black", "red", "pink","yellow","white", "blue"};
        for(String color : colors);
            System.out.println( "Color: " + color);

        ROW: for (int p = 1; p<=10; p++){
        COL:    for (int l; l<=10; l++)
                    System.out.println(p*l);
                System.out.println();

        }



    }
    
}

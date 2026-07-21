package chapter2;

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

    }
    
}

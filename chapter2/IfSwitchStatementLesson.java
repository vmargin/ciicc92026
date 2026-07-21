package chapter2;

public class IfSwitchStatementLesson {

    public static void main(String[] args) {
        int hourOfDay = 12;
        if (hourOfDay<11) {
            System.out.println("Good morning");
            System.out.println("Kumain kana ba?");


            //if else
            if (hourOfDay)
                System.out.println("good morning");
            else
                System.out.println("good afternoon");
        }



            int dayOfWeek = 4;
            switch(dayOfWeek) {
                case 1: System.out.println("Monday");
                case 2: System.out.println("Tuesday");
                case 3: System.out.println("Wed");
                case 4: System.out.println("Thurs");
                case 5: System.out.println("Fri");
                case 6: System.out.println("Sat");
                case 7: System.out.println("Sun");
            }

        }
    }
    


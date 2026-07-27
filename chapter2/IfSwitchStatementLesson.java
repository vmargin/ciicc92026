package chapter2;

public class IfSwitchStatementLesson {

    public static void main(String[] args) {
        int hourOfDay = 2;
        if (hourOfDay<12) {
            System.out.println("Good morning");
            System.out.println("Kumain kana ba?");

        }


            //if else
            if (hourOfDay == 12) {
                System.out.println("good morning");
             } else {
                System.out.println("good afternoon");
            }
            



            int dayOfWeek = 4;
            switch(dayOfWeek) {
                case 1: System.out.println("Monday");
                break;
                case 2: System.out.println("Tuesday");
                break;
                case 3: System.out.println("Wed");break;
                case 4: System.out.println("Thurs");break;
                case 5: System.out.println("Fri");break;
                case 6: System.out.println("Sat");break;
                case 7: System.out.println("Sun");break;

            }

        }
    }
    


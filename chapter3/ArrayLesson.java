package chapter3;
import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        
        int[] i = new int[3];
        int[]  numbers2 = new int[]{1,54,75};
        int[]  numbers3 = {1,54,75};
        Student[] batch9 = {new Student(), new Student(), new Student()};

        for (int j =0; j<numbers3.length; j++){
            System.out.println(numbers3[j]);
        
            int[] numbers4 = {1,5,3,6,72,3,5,66,234,567,23,5,6,7,8,9,0};
            Arrays.sort(numbers4);
            for(int numers4:numbers4)
            System.out.print(numers4+",");
            
            int searchNum = 34;
            System.out.println("34 search result:" +Arrays.binarySearch(numbers4, searchNum));

            String[] numbersString = {"1","5","3","6","72","3","5","66","234","567","23","5","6","7","8","9","0"};
            Arrays.sort(numbersString);
            for(String numStr:numbersString){
                System.out.print(numStr+",");
            }
            System.out.println();
        }


    }
    
}

class Student {
    String fullname;
    int age;
    String address;
    String course;
    int yearlevel;
}


public class array2 {
    public static void main(String[] args) {

        int[] number = { 10, 25, 7, 42, 18 };
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                count++;
            }
        }
        int even []= new int[count];
        int evenIndex = 0;

        for (int j = 0; j < even.length; j++) {
            if (even[j] % 2 == 0) {
                even [evenIndex] = even[j];
                evenIndex++;
                
            }
            

        }


    System.out.println(even );
    }

}

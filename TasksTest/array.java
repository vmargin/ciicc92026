public class array {
    public static void main(String[] args) {
        int[] number = { 10, 25, 7, 42, 18, 20, 50, 239, 98, 67 };
        int count = 0;
        int sum = 0;
        int largest = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 20) {
                count++;
                sum += number[i];
                if (number[i] > largest) {
                    largest = number[i];
                }
            }
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println((double) sum / count);
        System.out.println(largest);

    }

}

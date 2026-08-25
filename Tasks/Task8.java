package Tasks;

public class Task8 {

    public static void main(String[] args) {

        System.out.println("Total sum: " + sumOfSums(5, 6, 7, 8, 9, 10));
    }

    public static int sumOfSums(int... numbers) {
        int cumulativeSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int individualSum = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                individualSum += j;
            }
            cumulativeSum += individualSum;
            System.out.println(
                    "Parameter " + numbers[i]
                            + ": sum = " + individualSum
                            + ", cumulative sum = " + cumulativeSum);
        }
        return cumulativeSum;
    }
}
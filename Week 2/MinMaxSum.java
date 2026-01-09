import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[5];

        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextLong();

        long sum = 0, min = arr[0], max = arr[0];

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
        sc.close();
    }
}

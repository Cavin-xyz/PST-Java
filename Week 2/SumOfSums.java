import java.util.Scanner;

public class SumOfSums {
    static int sumOfSumsOfDigits(int n) {
        String numStr = String.valueOf(n);
        int totalSum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int sum = 0;
            for (int j = i; j < numStr.length(); j++) {
                sum += numStr.charAt(j) - '0';
            }
            totalSum += sum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSumsOfDigits(n));
        sc.close();
    }
}

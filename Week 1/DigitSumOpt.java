import java.util.Scanner;

public class DigitSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Math.abs(sc.nextInt());
        int opt = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            if (opt == 1 && d % 2 == 0)
                sum += d;
            if (opt == 2 && d % 2 != 0)
                sum += d;
            n /= 10;
        }

        System.out.println(sum);
        sc.close();
    }
}

import java.util.Scanner;

public class SumLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a % 10;
        int y = b % 10;

        if (x < 0) x = -x;
        if (y < 0) y = -y;

        System.out.println(x + y);
        sc.close();
    }
}

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = 0, t = n;

        while (t != 0) {
            r = r * 10 + t % 10;
            t /= 10;
        }

        System.out.println(n == r ? 1 : 0);
        sc.close();
    }
}

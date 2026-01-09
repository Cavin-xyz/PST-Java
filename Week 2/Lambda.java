import java.util.*;

interface PerformOperation {
    boolean check(int n);
}

public class Lambda {
    
    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) return false;
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return n -> {
            int t = n, r = 0;
            while (t != 0) {
                r = r * 10 + t % 10;
                t /= 10;
            }
            return n == r;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int op = sc.nextInt();
            int num = sc.nextInt();
            PerformOperation p;

            if (op == 1) p = isOdd();
            else if (op == 2) p = isPrime();
            else p = isPalindrome();

            boolean res = p.check(num);

            if (op == 1) System.out.println(res ? "ODD" : "EVEN");
            else if (op == 2) System.out.println(res ? "PRIME" : "COMPOSITE");
            else System.out.println(res ? "PALINDROME" : "NOT PALINDROME");
        }

        sc.close();
    }
}

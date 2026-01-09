import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int levels = sc.nextInt();
        int headWeight = sc.nextInt();
        int increment = sc.nextInt();

        int totalWeight = 0;
        int currentWeight = headWeight;

        for (int i = 1; i <= levels; i++) {
            totalWeight += i * currentWeight;
            currentWeight += increment;
        }

        System.out.println(totalWeight);
        sc.close();
    }
}

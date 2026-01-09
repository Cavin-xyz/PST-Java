public class DigitCount {
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(292));   
        System.out.println(countDigits(1015)); 
    }
}

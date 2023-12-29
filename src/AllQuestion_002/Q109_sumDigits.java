package AllQuestion_002;

public class Q109_sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(3114));
        System.out.println(sumDigits(-6543));
    }

    public static int sumDigits(int n) {
        if(n < 0) {
            n = -n;
        }

        int tempN = n;
        int sumValue = 0;

        while(tempN > 0) {
            int lastDigit = tempN % 10;
            tempN /= 10;
            sumValue += lastDigit;
        }

        return sumValue;
    }
}

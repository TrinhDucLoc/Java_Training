package AllQuestion;

public class Q109_sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(3114));
        System.out.println(sumDigits(-6543));
        System.out.println(sumDigits(0));
    }

    static int sumDigits(int n) {
        int tempN = n;
        if(n < 0) {
            tempN = -n;
        }
        int sumValue = 0;
        while(tempN > 0) {
            int lastDigit = tempN % 10;
            sumValue += lastDigit;
            tempN /= 10;
        }
        return sumValue;
    }
}

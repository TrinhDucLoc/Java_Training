package Recode_002;

public class Q4_reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(12005));
        System.out.println(reverse(1));
        System.out.println(reverse(1000));
        System.out.println(reverse(0));
        System.out.println(reverse(-12345));
    }

    static int reverse(int n) {
        int flagReverse = 1;
        if(n == 0) {
            return 0;
        }
        if(n < 0) {
            flagReverse = -1;
            n = n * -1;
        }

        int reverseNum = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            n /= 10;
        }
        return reverseNum * flagReverse;
    }
}

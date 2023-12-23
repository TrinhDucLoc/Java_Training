package AllQuestion_002;

public class Q024_countDigit {
    public static void main(String[] args) {
        System.out.println(countDigit(32121, 1));
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
    }

    public static int countDigit(int n, int digit) {
        if(n < 0 || digit < 0) {
            return -1;
        }

        int countNum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            if(lastDigit == digit) {
                countNum++;
            }
        }
        return countNum;
    }
}

package AllQuestion_002;

public class Q032_isDigitSum {
    public static void main(String[] args) {
        System.out.println(isDigitSum(32121, 10));
        System.out.println(isDigitSum(32121, 9));
        System.out.println(isDigitSum(13, 6));
        System.out.println(isDigitSum(3, 3));
        System.out.println(isDigitSum(-543, 3));
    }

    public static int isDigitSum(int n, int m) {
//        validation
        if(n < 0 || m < 0) {
            return -1;
        }

        int sumN = 0;
        int tempN = n;
        while(tempN > 0) {
            int lastDigit = tempN % 10;
            tempN /= 10;
            sumN += lastDigit;
        }

        if(sumN < m) {
            return 1;
        } else {
            return 0;
        }
    }
}

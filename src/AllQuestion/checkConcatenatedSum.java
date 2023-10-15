package AllQuestion;

public class checkConcatenatedSum {
    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }

    static int checkConcatenatedSum(int n, int catlen) {
        int sumValue = 0;
        int tempNum = n;

//        while(n > 0) {
//            int lastDigit = n % 10;
//            sumValue +=
//            n /= 10;
//        }

        while (tempNum > 0) {
            int digit = tempNum % 10;
            tempNum /= 10;
//            for (int i = 1, j = 1; j <= catlen; i *= 10, j++) {
//                sumValue += digit * i;
//            }

            int digitMulti = digit;
            for(int i=1; i<catlen; i++) {
                digitMulti = digitMulti * 10 + digit;
            }
            sumValue += digitMulti;
        }

        if(sumValue == n) {
            return 1;
        } else {
            return 0;
        }
    }
}

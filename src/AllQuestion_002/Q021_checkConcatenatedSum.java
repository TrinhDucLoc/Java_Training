package AllQuestion_002;

public class Q021_checkConcatenatedSum {
    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }

    public static int checkConcatenatedSum(int n, int catlen) {
        int tempN = n;
        int sumValue = 0;
        while(tempN > 0) {
            /*
            1. lastDigit = tempN % 10
            2. update N = tempN / 10
            3.
             */
            int lastDigit = tempN % 10;
            tempN /= 10;
            int tempSum = 0;
            for(int i=1; i<=catlen; i++) {
                tempSum = tempSum * 10 + lastDigit;
            }
            sumValue += tempSum;
        }

        if(sumValue == n) {
            return 1;
        } else {
            return 0;
        }
    }
}

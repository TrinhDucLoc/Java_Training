package AllQuestion;

public class isDigitIncreasing {
    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));

//        testcase
        System.out.println(isDigitIncreasing(37));
        System.out.println(isDigitIncreasing(38));
    }

    static int isDigitIncreasing(int n) {
        for(int i=1; i<=9; i++) {
            int sumValue = 0;
            int nextValue = 0;
            int flagSum = 1;
            while(flagSum == 1) {
                nextValue = nextValue*10 + i;
                sumValue += nextValue;
                if(sumValue == n) {
                    return 1;
                } else if(sumValue > n) {
                    flagSum = 0;
                }
            }
        }
        return 0;
    }
}

package AllQuestion_002;

public class Q031_isDigitIncreasing {
    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(11));
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }

    public static int isDigitIncreasing(int n) {

        for(int i=1; i<=9; i++) {
            int sumValue = 0;
            int digitIncreasing = 0;
            while(sumValue < n) {
                digitIncreasing = digitIncreasing*10 + i;
                sumValue += digitIncreasing;
            }

            if(sumValue == n) {
                return 1;
            }
        }

        return 0;
    }
}

package Recode_002;

public class Q10_isFancy_recheckSolution {
    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(7));
        System.out.println(isFancy(4));
        System.out.println(isFancy(60));
        System.out.println(isFancy(61));
    }

    static int isFancy(int n) {
        int flagIsFancy = 0;
        int previousNumber = 1;
        int pPreviousNumber = 1;
        int currentNumber;

        if(n < 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        for(int i=1; i<n; i++) {
            currentNumber = previousNumber*3 + pPreviousNumber*2;
            if(currentNumber == n) {
                flagIsFancy = 1;
                return flagIsFancy;
            } else {
                pPreviousNumber = previousNumber;
                previousNumber = currentNumber;
            }
        }
        return flagIsFancy;
    }
}

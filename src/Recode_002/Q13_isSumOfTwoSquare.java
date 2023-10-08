package Recode_002;

public class Q13_isSumOfTwoSquare {
    public static void main(String[] args) {
        System.out.println(isSumOfTwoSquare(50));
        System.out.println(isSumOfTwoSquare(4));
        System.out.println(isSumOfTwoSquare(0));
    }

    static int isSumOfTwoSquare(int n) {
        int flagIsSumOfTwoSquare = 0;
        int count = 0;
        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                if(i*i + j*j == n) {
                    count++;
                }
            }
        }
        if(count >= 2) {
            flagIsSumOfTwoSquare = 1;
            return flagIsSumOfTwoSquare;
        } else {
            return flagIsSumOfTwoSquare;
        }
    }
}

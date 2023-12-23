package Recode_001;

public class Q7_isPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }

    static int isPerfectSquare(int n) {
        if(n < 0) {
            return 0;
        }

        int baseNum = (int) Math.sqrt(n);
        int nextNum = baseNum + 1;
        int nextPerfectSquareNum = (int) Math.pow(nextNum, 2);
        return nextPerfectSquareNum;
    }
}

package Test1_T1;

public class Q1_isPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }

    static int isPerfectSquare(int n) {
//        validate
        if(n < 0) {
            return 0;
        }

        int baseNum = (int) Math.sqrt(n);
        int nextNum = baseNum + 1;
        int nextPerfectSquare = (int) Math.pow(nextNum, 2);
        return nextPerfectSquare;
    }
}

public class Q7_isPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }

    public static int isPerfectSquare(int num) {
//        validate
        int nextPerfectNum = 0;
        if(num < 0) {
            return 0;
        } else {
            int baseNum =  (int) Math.sqrt(num);
            int nextNum = baseNum + 1;
            nextPerfectNum = (int) Math.pow(nextNum, 2);
        }
        return nextPerfectNum;
    }
}


// Solution
// validate: if n < 0 => return 0;
// sqrt num => (int) result => nextNum = result +  1;
// nextPerfectNum = (int) Math.pow(nextNum, 2)

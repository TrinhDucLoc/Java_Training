public class Q13_isSumOfTwoSquare {
    public static void main(String[] args) {
        System.out.println(isSumOfTwoSquare(50));
        System.out.println(isSumOfTwoSquare(4));
        System.out.println(isSumOfTwoSquare(0));
    }

    public static int isSumOfTwoSquare(int n) {
        int cnt = 0;
        for(int i=1; i<n; i++) {t ast
            for(int j=1; j<n; j++) {
                if(n == i*i + j*j) {
                    cnt++;
                }
            }
        }
        if(cnt >= 2) {
            return 1;
        } else {
            return 0;
        }
    }
}

// solution
// Math: num = i*i + j*j with two ways

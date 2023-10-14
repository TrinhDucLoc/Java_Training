package AllQuestion;

public class closestFibonacci {
    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(12));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }

    static int closestFibonacci(int n) {
        if(n < 2) {
            return 0;
        }

        int fibo1 = 1;
        int fibo2 = 1;
        int fibo;
        for(int i=3; i<=n; i++) {
            fibo = fibo1 + fibo2;
            if(fibo > n) {
                return fibo2;
            }
            fibo1 = fibo2;
            fibo2 = fibo;
        }
        return 0;
    }
}

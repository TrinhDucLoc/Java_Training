package AllQuestion_002;

public class Q016_closestFibonacci {
    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(12));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }

    public static int closestFibonacci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }

        int fibo1 = 1;
        int fibo2 = 1;

        while(fibo2 < n) {
            int nextFibo = fibo1 + fibo2;
            if(nextFibo > n) {
                break;
            }
            fibo1 = fibo2;
            fibo2 = nextFibo;
        }
        return fibo2;
    }
}

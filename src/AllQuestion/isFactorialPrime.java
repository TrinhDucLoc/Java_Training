package AllQuestion;

public class isFactorialPrime {
    public static void main(String[] args) {
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
    }

    static int isPrime(int n) {
        if(n <= 1){
            return 0;
        }
        for(int i=2; i<= (int) Math.sqrt(n); i++) {
            if(n%i==0) {
                return 0;
            }
        }
        return 1;
    }

    static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return (n * factorial(n - 1));

    }

    static int isFactorialPrime(int n) {
        if(isPrime(n) == 1) {
            int sumValue = 0;
            for(int i=1; i < n && sumValue < n; i++) {
                sumValue = factorial(i) + 1;
            }
            if(sumValue == n) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }

}

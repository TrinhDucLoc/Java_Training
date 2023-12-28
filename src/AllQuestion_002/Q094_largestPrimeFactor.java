package AllQuestion_002;

public class Q094_largestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

    public static int largestPrimeFactor(int n) {
        if(n <= 1) {
            return 0;
        }
        int largestPrimeFactorNum = 0;

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0 && isPrime(i) == 1 && largestPrimeFactorNum < i) {
                largestPrimeFactorNum = i;
            }
        }
        return largestPrimeFactorNum;
    }

    public static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }

        for(int i=2; i<= n/2; i++) {
            if(n % i ==0) {
                return 0;
            }
        }

        return 1;
    }
}

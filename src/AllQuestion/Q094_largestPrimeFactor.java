package AllQuestion;

public class Q094_largestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
        System.out.println(largestPrimeFactor(11));
    }

    static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }

        for(int i=2; i<= (int) Math.sqrt(n); i++) {
            if(n%i == 0) {
                return 0;
            }
        }

        return 1;
    }

    static int largestPrimeFactor(int n) {
//        validate
        if(n <= 1) {
            return 0;
        }

        int maxPrimeFactorNum = Integer.MIN_VALUE;

        for(int i=2; i<=n; i++) {
            if(n%i==0 && isPrime(i) == 1 && i > maxPrimeFactorNum) {
                maxPrimeFactorNum = i;
            }
        }
        return maxPrimeFactorNum;
    }

}

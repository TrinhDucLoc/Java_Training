package AllQuestion;

public class Q095_primeHappy {
    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
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

    static int isPrimeHappy(int n) {
        if(n <= 2) {
            return 0;
        }
        int sumPrime = 0;
        int flagOnePrime = 0;
        for(int i=2; i<=n; i++) {
            if(isPrime(i) == 1) {
                sumPrime += i;
                flagOnePrime = 1;
            }
        }
        if(flagOnePrime == 0) {
            return 0;
        }
        if(sumPrime % n == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}

package AllQuestion_002;

public class Q095_isPrimeHappy {
    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
    }

    public static int isPrimeHappy(int n) {
        int sumPrime = 0;

        if(n <= 2) {
            return 0;
        }

        for(int i=2; i<n; i++) {
            if(isPrime(i) == 1) {
                sumPrime += i;
            }
        }

        if(sumPrime % n == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}

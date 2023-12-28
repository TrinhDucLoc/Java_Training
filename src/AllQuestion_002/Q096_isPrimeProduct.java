package AllQuestion_002;

public class Q096_isPrimeProduct {
    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
        System.out.println(isPrimeProduct(18));
        System.out.println(isPrimeProduct(15));
        System.out.println(isPrimeProduct(49));    }

    public static int isPrimeProduct(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i) == 1 && isPrime(n/i) == 1 && n/i != i) {
                return 1;
            }
        }
        return 0;
    }

    public static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }

        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                return 0;
            }
        }

        return 1;
    }
}

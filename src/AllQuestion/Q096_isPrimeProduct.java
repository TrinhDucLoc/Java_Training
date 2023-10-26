package AllQuestion;

public class Q096_isPrimeProduct {
    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
        System.out.println(isPrimeProduct(18));
        System.out.println(isPrimeProduct(15));
        System.out.println(isPrimeProduct(49));
    }

    static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }

        for(int i=2; i<= (int) Math.sqrt(n); i++) {
            if(n%i==0) {
                return 0;
            }
        }

        return 1;
    }

    static int isPrimeProduct(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i) == 1 && i*2 == n) {
                return 1;
            }
        }
        return 0;
    }
}

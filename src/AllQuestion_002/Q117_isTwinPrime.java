package AllQuestion_002;

public class Q117_isTwinPrime {
    public static void main(String[] args) {
        System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));
    }

    public static int isTwinPrime(int n) {
        if(isPrime(n) == 1) {
            if(isPrime(n+2) == 1 || isPrime(n-2) == 1) {
                return 1;
            }
        }
        return 0;
    }

    public static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }

        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}

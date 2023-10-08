package Recode_002;

public class Q9_primeCount_wrongWhenCodeIsPrime {
    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11,29));
        System.out.println(primeCount(20,22));
        System.out.println(primeCount(1,1));
        System.out.println(primeCount(5,5));
        System.out.println(primeCount(6,2));
        System.out.println(primeCount(-10,6));
    }

    static int primeCount(int start, int end) {
        int count = 0;
        for(int i=start; i<=end; i++) {
            if(isPrime(i) == 1) {
                count++;
            }
        }
        return count;
    }

    static int isPrime(int n) {
        int flagIsPrime = 0;
        if(n > 1) {
            flagIsPrime = 1;
            for(int i=2; i<=n/2; i++) {
                if(n%i == 0) {
                    flagIsPrime = 0;
                    return flagIsPrime;
                }
            }
        }
        return flagIsPrime;
    }
}

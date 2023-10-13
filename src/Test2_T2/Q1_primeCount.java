package Test2_T2;

public class Q1_primeCount {
    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(1, 6));
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

    static int isPrime(int num) {
        if(num <= 1) {
            return 0;
        }
        for(int i=2; i<= (int) Math.sqrt(num); i++) {
            if(num % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}

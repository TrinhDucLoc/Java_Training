package AllQuestion;

public class Q093_primeCount {
    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));
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

    static int primeCount(int start, int end) {
        int count = 0;
        for(int i=start; i<=end; i++) {
            if(isPrime(i) == 1) {
                count++;
            }
        }
        return count;
    }
}

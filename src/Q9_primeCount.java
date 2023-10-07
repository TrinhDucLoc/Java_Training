public class Q9_primeCount {
    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11,29));
        System.out.println(primeCount(20,22));
        System.out.println(primeCount(1,1));
        System.out.println(primeCount(5,5));
        System.out.println(primeCount(6,2));
        System.out.println(primeCount(-10,6));
    }

    public static int primeCount(int start, int end) {
        int cnt = 0;
        for(int i=start; i<=end; i++) {
//            if(i > 1) {
//                int isPrime = 1;
//                for(int j=2; j<=i/2; j++) {
//                    if(i%j == 0) {
//                        isPrime = 0;
//                        break;
//                    }
//                }
//                if(isPrime == 1) {
//                    cnt++;
//                }
//            }
            if(isPrime(i) == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int isPrime(int num) {
        if(num > 1) {
            for(int i=2; i<=num/2; i++) {
                if(num % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }
}


// Solution primeCount
// primeNum is higher than 1 (num > 1)
// Loop int i=start; i<end; i++
// Loop int j=2; j<i/2; j++
// if(i%j == 0) => Isn't prime num else is prime num

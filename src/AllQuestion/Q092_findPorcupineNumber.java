package AllQuestion;

public class Q092_findPorcupineNumber {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(137));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));
        System.out.println(findPorcupineNumber(7));
        System.out.println(findPorcupineNumber(1));
    }

    static int findPorcupineNumber(int n) {
        int maxN = Integer.MAX_VALUE;
        int flagPorcupine = 0;
        int porcupineNumber = 0;
        for(int i=n+1; i<=maxN; i++) {
            if(isPrime(i) == 1 && flagPorcupine == 0) {
                if(i % 10 == 9) {
                    flagPorcupine = 1;
                    porcupineNumber = i;
                }
            } else if(isPrime(i) == 1 && flagPorcupine == 1) {
                if(i % 10 == 9) {
                    break;
                } else {
                    flagPorcupine = 0;
                }
            }
        }
        return porcupineNumber;
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
}

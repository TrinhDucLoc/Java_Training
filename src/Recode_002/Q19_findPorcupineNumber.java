package Recode_002;

public class Q19_findPorcupineNumber {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));
    }

    static int findPorcupineNumber(int n) {
        int porcupineNumber = 0;
        int maxValue = Integer.MAX_VALUE;
        int flagProcupine = 0;
        for(int i = n+1; i<maxValue; i++) {
            if(isPrime(i) == 1 && flagProcupine == 0) {
                if(i % 10 == 9) {
                    flagProcupine = 1;
                    porcupineNumber = i;
                }
            } else if(isPrime(i) == 1 && flagProcupine == 1) {
                if(i % 10 == 9) {
                    break;
                } else {
                    flagProcupine = 0;
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

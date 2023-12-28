package AllQuestion_002;

public class Q092_findPorcupineNumber {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(137));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));
        System.out.println(findPorcupineNumber(7));
        System.out.println(findPorcupineNumber(1));
    }

    public static int findPorcupineNumber(int n) {
        int currentNum = n + 1;
        int flagPorcupine = 0;

        while(flagPorcupine == 0) {
            if(isPrime(currentNum) == 1 && currentNum % 10 == 9) {
                int nextPrime = currentNum + 1;
                int flagNextPrime = 0;
                while(flagNextPrime == 0) {
                    if(isPrime(nextPrime) == 1) {
                        if(nextPrime % 10 == 9) {
                            flagPorcupine = 1;
                            flagNextPrime = 1;
                        } else {
                            currentNum = nextPrime + 1;
                            flagNextPrime = 1;
                        }
                    } else {
                        nextPrime++;
                    }
                }
            } else {
                currentNum++;
            }
        }
        return currentNum;
    }

    public static int isPrime(int n) {
        if(n <= 0) {
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

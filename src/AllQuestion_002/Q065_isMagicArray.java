package AllQuestion_002;

public class Q065_isMagicArray {
    public static void main(String[] args) {
        System.out.println(isMagicArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isMagicArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isMagicArray(new int[]{10, 5, 5}));
        System.out.println(isMagicArray(new int[]{0, 6, 8, 20}));
        System.out.println(isMagicArray(new int[]{3}));
        System.out.println(isMagicArray(new int[]{8, 5, -5, 5, 3}));
    }

    public static int isMagicArray(int[] a) {
        int flagPrime = 0;
        int sumPrime = 0;
        for(int i=0; i<a.length; i++) {
            if(isPrime(a[i]) == 1) {
                flagPrime = 1;
                sumPrime += a[i];
            }
        }

        if(flagPrime == 1 && a[0] != sumPrime) {
            return 0;
        } else if(flagPrime == 0 && a[0] != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }

        for(int i=2; i<= n/2; i++) {
            if(n%i == 0) {
                return 0;
            }
        }

        return 1;
    }
}

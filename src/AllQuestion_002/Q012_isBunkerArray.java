package AllQuestion_002;

public class Q012_isBunkerArray {
    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 7, 3}));
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21}));

        System.out.println();
        System.out.println(isBunker(new int[]{7, 6, 10, 1}));
        System.out.println(isBunker(new int[]{7, 6, 10}));
        System.out.println(isBunker(new int[]{6, 10, 1}));
        System.out.println(isBunker(new int[]{3, 7, 1, 8, 1}));
    }

    public static int isBunkerArray(int[] a) {
        for(int i=0; i<a.length-1; i++) {
            if(a[i] % 2 != 0 && isPrime(a[i+1]) == 1) {
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

    public static int isBunker(int[] a) {
        int flagOne = 0, flagPrime = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == 1) {
                flagOne = 1;
            }
            if(isPrime(a[i]) == 1) {
                flagPrime = 1;
            }
        }
        if(flagOne == 1 && flagPrime == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

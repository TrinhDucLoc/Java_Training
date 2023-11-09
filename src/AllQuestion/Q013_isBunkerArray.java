package AllQuestion;

public class Q013_isBunkerArray {
    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 7, 3}));
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21}));

        System.out.println();
        System.out.println(isBunker(11));
        System.out.println(isBunker(22));
        System.out.println(isBunker(8));

        System.out.println();
        System.out.println(isBunker(new int[] {7, 6, 10, 1}));
        System.out.println(isBunker(new int[] {7, 6, 10} ));
        System.out.println(isBunker(new int[] {6, 10, 1}));
        System.out.println(isBunker(new int[] {3, 7, 1, 8, 1}));
    }

    static int isBunkerArray(int[] a) {
        int flagBunker = 0;
        for(int i=0; i<a.length-1; i++) {
            if(a[i] % 2 != 0 && isPrime(a[i+1]) == 1) {
                flagBunker = 1;
            }
        }
        if(flagBunker == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }

        for(int i=2; i<= (int) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    static int isBunker(int n) {
        int number = 1;
        int index = 1;
        if(n == 1) {
            return 1;
        }
        while(number < n) {
            number += index;
            index++;
        }
        if(number == n) {
            return 1;
        } else {
            return 0;
        }
    }

    static int isBunker(int[] a) {
        int countOne = 0;
        int countPrime = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == 1) {
                countOne++;
            }
            if(isPrime(a[i]) == 1) {
                countPrime++;
            }
        }

        if(countOne > 0 && countPrime > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

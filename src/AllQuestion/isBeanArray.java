package AllQuestion;

public class isBeanArray {
    public static void main(String[] args) {
        System.out.println(isBeanArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isBeanArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isBeanArray(new int[]{10, 5, 5}));
        System.out.println(isBeanArray(new int[]{0, 6, 8, 20}));
        System.out.println(isBeanArray(new int[]{3}));
        System.out.println(isBeanArray(new int[]{8, 5, -5, 5, 3}));
    }

    static int isBeanArray(int[] a) {
        int sumPrime = 0;

        for(int i=0; i<a.length; i++) {
            if(isPrime(a[i]) == 1) {
                sumPrime += a[i];
            }
        }
        if(a[0] == sumPrime) {
            return 1;
        } else {
            return 0;
        }
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

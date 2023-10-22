package AllQuestion;

public class Q065_isMagicArray {
    public static void main(String[] args) {
        System.out.println(isMagicArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isMagicArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isMagicArray(new int[]{10, 5, 5}));
        System.out.println(isMagicArray(new int[]{0, 6, 8, 20}));
        System.out.println(isMagicArray(new int[]{3}));
        System.out.println(isMagicArray(new int[]{8, 5, -5, 5, 3}));
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

    static int isMagicArray(int[] a) {
        int sumValue = 0;
        for(int i=0; i<a.length; i++) {
            if(isPrime(a[i]) == 1){
                sumValue += a[i];
            }
        }
        if(sumValue == 0 && a[0] == 0) {
            return 1;
        }

        if(sumValue == a[0]){
            return 1;
        } else {
            return 0;
        }
    }
}

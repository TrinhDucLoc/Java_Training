package AllQuestion_002;

public class Q078_isNice {
    public static void main(String[] args) {
        System.out.println(isNice(new int[]{2, 10, 9, 3}));
        System.out.println(isNice(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isNice(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isNice(new int[]{0, -1, 1}));
        System.out.println(isNice(new int[]{3, 4, 5, 7}));

        System.out.println();
        System.out.println(isNiceArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isNiceArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isNiceArray(new int[]{10, 5, 5}));
        System.out.println(isNiceArray(new int[]{0, 6, 8, 20}));
        System.out.println(isNiceArray(new int[]{3}));
        System.out.println(isNiceArray(new int[]{8, 5, -5, 5, 3}));
    }

    public static int isNice(int[] a) {
        for(int i=0; i<a.length; i++) {
            int flag = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == a[j] - 1 || a[i] == a[j] + 1) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                return 0;
            }
        }

        return 1;
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

    public static int isNiceArray(int[] a) {
        int sumPrime = 0;

        for(int i=0; i<a.length; i++) {
            if(isPrime(a[i]) == 1) {
                sumPrime += a[i];
            }
        }

        if(sumPrime == a[0]) {
            return 1;
        } else {
            return 0;
        }
    }
}

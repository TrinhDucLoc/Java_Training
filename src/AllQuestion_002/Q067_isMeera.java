package AllQuestion_002;

public class Q067_isMeera {
    public static void main(String[] args) {
        System.out.println(isMeera(6));
        System.out.println(isMeera(30));
        System.out.println(isMeera(21));

        System.out.println();
        System.out.println(isMeera1(new int[]{3, 5, -2}));
        System.out.println(isMeera1(new int[]{8, 3, 4}));

        System.out.println();
        System.out.println(isMeera2(new int[]{-4, 0, 1, 0, 2, 1}));
        System.out.println(isMeera2(new int[]{-8, 0, 0, 8, 0}));
        System.out.println(isMeera2(new int[]{-8, 0, 0, 2, 0}));

        System.out.println();
        System.out.println(isMeera3(new int[]{7, 6, 0, 10, 1}));
        System.out.println(isMeera3(new int[]{6, 10, 1}));
        System.out.println(isMeera3(new int[]{7, 6, 10}));
        System.out.println(isMeera3(new int[]{6, 10, 0}));
        System.out.println(isMeera3(new int[]{3, 7, 0, 8, 0, 5}));

        System.out.println();
        System.out.println(isMeera4(new int[]{7, 9, 0, 10, 1}));
        System.out.println(isMeera4(new int[]{6, 10, 8}));
        System.out.println(isMeera4(new int[]{7, 6, 1}));
        System.out.println(isMeera4(new int[]{9, 10, 0}));
        System.out.println(isMeera4(new int[]{1, 1, 0, 8, 0, 9, 9, 1}));
    }

    public static int isMeera(int n) {
        int countNontrivialFactor = 0;

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                countNontrivialFactor++;
            }
        }

        if(n%countNontrivialFactor == 0) {
            return 1;
        } else {
            return 0;
        }
    }


    public static int isMeera1(int[] a) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                if(a[i] == a[j]*2) {
                    return 0;
                }
            }
        }
        return 1;

        /* sorted O(NLogN)
        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
         */
    }

    public static int isMeera2(int[] a) {
//        (a) a[i] is less than i for i = 0 to a.length-1.
//        (b) sum of all elements of a is 0.
        int sumValue = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] >= i) {
                return 0;
            }
            sumValue += a[i];
        }

        if(sumValue == 0) {
            return 1;
        } else {
            return 0;
        }
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

    public static int isMeera3(int[] a) {
        int flagZero = 0;
        int flagPrime = 0;

        for(int i=0; i<a.length; i++) {
            if(isPrime(a[i]) == 1) {
                flagPrime = 1;
            }

            if(a[i] == 0) {
                flagZero = 1;
            }
        }

        if((flagPrime == 1 && flagZero == 1) || (flagPrime == 0 && flagZero == 0)) {
            return 1;
        }
        return 0;
    }

    public static int isMeera4(int[] a) {
        int flagOne = 0;
        int flagNine = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] == 1) {
                flagOne = 1;
            }
            if(a[i] == 9) {
                flagNine = 1;
            }
        }

        if((flagOne == 1 && flagNine == 1) || (flagOne == 0 && flagNine == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
}

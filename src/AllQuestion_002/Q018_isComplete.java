package AllQuestion_002;

public class Q018_isComplete {
    public static void main(String[] args) {
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(9));
        System.out.println(isSquare(7));

        System.out.println();
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 8, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 3, 6}));
        System.out.println(isComplete(new int[]{2, -3, 4, 3, 6}));

        System.out.println();
        System.out.println(isComplete1(new int[]{36, -28}));
        System.out.println(isComplete1(new int[]{36, 28}));
        System.out.println(isComplete1(new int[]{4}));
        System.out.println(isComplete1(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete1(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));

        System.out.println();
        System.out.println(isComplete2(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete2(new int[]{5, 7, 9, 13}));
        System.out.println(isComplete2(new int[]{2, 2}));
        System.out.println(isComplete2(new int[]{2, 6, 3, 4}));
    }

    public static int isComplete(int[] a) {
        int flagGreaterZero = 0;
        int flagAllEvenLessThanMaxValue = 0;
        int maxValue = 0x80000000;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0 && maxValue < a[i]) {
                maxValue = a[i];
            }

            if(a[i] <= 0) {
                return 0;
            }
        }

        for(int i=2; i<=maxValue-2; i+=2) {
            int flag = 0;
            for(int j=0; j<a.length; j++) {
                if(i == a[j]) {
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

    public static int isComplete1(int[] a) {
        int flagEven = 0, flagPerfectSquare = 0, flagSum8 = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0) {
                flagEven = 1;
            }
            if(isSquare(a[i]) == 1) {
                flagPerfectSquare = 1;
            }
            for(int j=i+1; j<a.length; j++) {
                if(a[i] + a[j] == 8) {
                    flagSum8 = 1;
                }
            }
        }

        if(flagEven == 1 && flagPerfectSquare == 1 && flagSum8 == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int isSquare(int n) {
        for(int i=0; i<n; i++) {
            if(i*i == n) {
                return 1;
            }
        }
        return 0;
    }

    public static int isComplete2(int[] a) {
//          a. The array contains even numbers
//        b. Let min be the smallest even number in the array.
//        c. Let max be the largest even number in the array.
//          d. min does not equal max
//          e. All numbers between min and max are in the array
        int minValue = 0, maxValue = 0;

        int flagEven = 0;
        int flagMin = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0 && flagMin == 0) {
                flagEven = 1;
                minValue = a[i];
                flagMin = 1;
            }
            if(a[i] % 2 == 0 && flagMin == 1 && a[i] < minValue) {
                minValue = a[i];
            }
        }
        if(flagEven == 0) {
            return 0;
        }

        int flagMax = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0 && flagMax == 0) {
                maxValue = a[i];
                flagMax = 1;
            }

            if(a[i] % 2 == 0 && flagMax == 1 && a[i] > maxValue) {
                maxValue = a[i];
            }
        }

        if(minValue == maxValue) {
            return 0;
        }

        for(int i=minValue+1; i<maxValue; i++) {
            int flag = 0;
            for(int j=0; j<a.length; j++) {
                if(i == a[j]) {
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
}

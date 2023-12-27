package AllQuestion_002;

public class Q082_isOddHeavy {
    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
    }

    public static int isOddHeavy(int[] a) {
        int flagOdd = 0, flagEven = 0;
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 != 0) {
                flagOdd = 1;
                if(minOdd > a[i]) {
                    minOdd = a[i];
                }
            } else {
                flagEven = 1;
                if(maxEven < a[i]) {
                    maxEven = a[i];
                }
            }
        }

        if((flagOdd == 1 && flagEven == 0) || (flagOdd == 1 && flagEven == 1 && minOdd > maxEven)) {
            return 1;
        } else {
            return 0;
        }
    }
}

package Recode_001;

public class Q15_arrayEvenAndEqual {
    public static void main(String[] args) {
        System.out.println(arrayEvenAndEqual(new int[]{5,4,3,2,3,4,6,1}));
        System.out.println(arrayEvenAndEqual(new int[]{1,2,1,2}));
        System.out.println(arrayEvenAndEqual(new int[]{0}));
        System.out.println(arrayEvenAndEqual(new int[]{}));
    }

    static int arrayEvenAndEqual(int[] a) {
        int flagRes = 0;
        int sumLeft = 0;
        int sumRight = 0;

        if(a.length % 2 != 0 || a.length < 2) {
            return flagRes;
        }

        for(int i=0; i<a.length; i++) {
            if(i < a.length / 2) {
                sumLeft += a[i];
            } else {
                sumRight += a[i];
            }
        }

        if(sumLeft == sumRight) {
            flagRes = 1;
            return flagRes;
        } else {
            return flagRes;
        }
    }
}

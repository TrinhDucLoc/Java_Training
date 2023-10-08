package Recode_002;

public class Q1_isCentered {
    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{1,2,3,4,5}));
        System.out.println(isCentered(new int[]{3,2,1,4,5}));
        System.out.println(isCentered(new int[]{3,2,1,4,1}));
        System.out.println(isCentered(new int[]{1,2,3,4}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(new int[]{10}));
    }

    static int isCentered(int[] a) {
//        validate
        int flagIsContered = 1;
        if(a.length % 2 == 0 || a.length == 0) {
            flagIsContered = 0;
            return flagIsContered;
        }

        int middleIndex = a.length / 2;
        int middleValue = a[middleIndex];

        for(int i=0; i<a.length; i++) {
            if(a[i] <= middleValue && i != middleIndex) {
                flagIsContered = 0;
                return flagIsContered;
            }
        }
        return flagIsContered;
    }
}

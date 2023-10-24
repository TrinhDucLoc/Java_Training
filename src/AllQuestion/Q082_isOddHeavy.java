package AllQuestion;

import java.util.Map;

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

//    Way 1:
//    static int isOddHeavy(int[] a) {
//        int flagOdd = 0;
//        int lengthOddArray = 0;
//        for(int i=0; i<a.length; i++) {
//            if(a[i] % 2 != 0) {
//                flagOdd = 1;
//                lengthOddArray++;
//            }
//        }
//
//        if(flagOdd == 0) {
//            return 0;
//        }
//
//        int[] oddArray = new int[lengthOddArray];
//        int keyOdd = 0;
//        for(int i=0; i<a.length; i++) {
//            if(a[i] % 2 != 0) {
//                oddArray[keyOdd] = a[i];
//                keyOdd++;
//            }
//        }
//
//        for(int i=0; i<lengthOddArray; i++) {
//            for(int j=0; j<a.length; j++) {
//                if(a[j] % 2 == 0 && oddArray[i] <= a[j]) {
//                    return 0;
//                }
//            }
//        }
//
//        return 1;
//    }

//    Way 2:
    static int isOddHeavy(int[] a) {
        int minOddValue = Integer.MAX_VALUE;
        int maxEvenValue = Integer.MIN_VALUE;
        int flagOdd = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 != 0) {
                flagOdd = 1;
                if(a[i] < minOddValue) {
                    minOddValue = a[i];
                }
            } else {
                if(a[i] > maxEvenValue) {
                    maxEvenValue = a[i];
                }
            }
        }
        if(flagOdd == 1 && minOddValue > maxEvenValue) {
            return 1;
        } else {
            return 0;
        }
    }
}

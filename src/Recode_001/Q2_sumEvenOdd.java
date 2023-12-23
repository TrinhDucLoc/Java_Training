package Recode_001;

public class Q2_sumEvenOdd {
    public static void main(String[] args) {
        System.out.println(sumEvenOdd(new int[]{1}));
        System.out.println(sumEvenOdd(new int[]{1,2}));
        System.out.println(sumEvenOdd(new int[]{1,2,3}));
        System.out.println(sumEvenOdd(new int[]{1,2,3,4}));
        System.out.println(sumEvenOdd(new int[]{3,3,4,4,}));
        System.out.println(sumEvenOdd(new int[]{}));
    }

    static int sumEvenOdd(int[] a) {
        int sumEven = 0;
        int sumOdd = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0) {
                sumEven += a[i];
            } else {
                sumOdd += a[i];
            }
        }

        return sumOdd - sumEven;
    }
}

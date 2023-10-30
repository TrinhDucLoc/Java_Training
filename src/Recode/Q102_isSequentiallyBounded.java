package Recode;

public class Q102_isSequentiallyBounded {
    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));
        System.out.println(isSequentiallyBounded(new int[]{0}));
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
    }

    static int isSequentiallyBounded(int[] a) {
//        validate
        if(a.length < 1) {
            return 1;
        }
        if(a[0] <= 1) {
            return 0;
        }

        int count = 1;
        for(int i=0; i<a.length-1; i++) {
            if(a[i] < 0) {
                return 0;
            }
//            ascending
            if(a[i] > a[i+1]) {
                return 0;
            }
//            element occurs less than n times in the array
            if(a[i] == a[i+1]) {
                count++;
            } else {
                count = 1;
            }
            if(count >= a[i]) {
                return 0;
            }
        }
        return 1;
    }
}

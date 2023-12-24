package AllQuestion_002;

public class Q055_isInertial {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1} ));
        System.out.println(isInertial(new int[]{2}));
        System.out.println(isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(isInertial(new int[]{2, 3, 5, 7} ));
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10} ));
    }

    public static int isInertial(int[] a) {
//        a. it contains at least one odd value
//        b. the maximum value in the array is even
//        c. every odd value is greater than every even value that is not the maximum
//        value.

        int flagOdd = 0;
        int maxEvenValue = Integer.MIN_VALUE;
        int minEvenValue = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 != 0) {
                flagOdd = 1;
            }

            if(maxEvenValue < a[i]) {
                maxEvenValue = a[i];
            }

            if(a[i] % 2 == 0 && minEvenValue > a[i]) {
                minEvenValue = a[i];
            }
        }

        if(flagOdd == 0 || maxEvenValue % 2 != 0) {
            return 0;
        }

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 != 0 && a[i] <= minEvenValue && minEvenValue != maxEvenValue) {
                return 0;
            }
        }
        return 1;
     }
}

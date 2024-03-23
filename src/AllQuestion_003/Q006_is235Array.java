package AllQuestion_003;

public class Q006_is235Array {
    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }

    public static int is235Array(int[] a) {
        int divTwo = 0;
        int divThree = 0;
        int divFive = 0;
        int nonDiv = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 || a[i] % 3 == 0 || a[i] % 5 ==0) {
                if(a[i] % 2 == 0) {
                    divTwo++;
                }
                if (a[i] % 3 == 0) {
                    divThree++;
                }
                if (a[i] % 5 == 0) {
                    divFive++;
                }
            } else {
                nonDiv++;
            }
        }

        if (divTwo + divThree + divFive + nonDiv == a.length) {
            return 1;
        } else {
            return 0;
        }
    }
}

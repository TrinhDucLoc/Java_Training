package AllQuestion_002;

import java.util.Arrays;

public class Q056_doIntegerBasedRounding {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(a, 2);
        System.out.println(Arrays.toString(a));

        int[] b = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(b, 3);
        System.out.println(Arrays.toString(b));

        int[] c = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(c, -3);
        System.out.println(Arrays.toString(c));

        int[] d = new int[]{-1, -2, -3, -4, -5};
        doIntegerBasedRounding(d, 3);
        System.out.println(Arrays.toString(d));

        int[] e = new int[]{-18, 1, 2, 3, 4, 5};
        doIntegerBasedRounding(e, 4);
        System.out.println(Arrays.toString(e));

        int[] f = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(f, 5);
        System.out.println(Arrays.toString(f));

        int[] g = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(g, 100);
        System.out.println(Arrays.toString(g));
    }

    public static void doIntegerBasedRounding(int[] a, int n) {
        for(int i=0; i<a.length; i++) {
            if(n<0) {
                break;
            }
            if(a[i] <= 0) {
                continue;
            }

            int round = a[i]/n;
            int minValue;
            int maxValue;

            if(a[i] % n == 0) {
                minValue = n*(round-1);
                maxValue = n*round;
            } else {
                minValue = n*round;
                maxValue = n*(round+1);
            }

            int midValue = (minValue + maxValue) / 2;

            if(a[i] <= midValue) {
                a[i] = minValue;
            } else {
                a[i] = maxValue;
            }
        }
    }
}

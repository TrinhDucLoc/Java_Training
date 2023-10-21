package AllQuestion;

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

    static void doIntegerBasedRounding(int[] a, int n) {
        if(n > 0) {
            for(int i=0; i<a.length; i++) {
                int j = 1;
                int previousValue;
                int nextValue;
                if(a[i] < 0) {
                    continue;
                }
                int flag = 0;
                while((flag == 0)) {
                    previousValue = n*(j-1);
                    nextValue = n*j;
                    if(previousValue <= a[i] && a[i] <= nextValue) {
                        if(a[i] - previousValue >= nextValue - a[i]) {
                            a[i] = nextValue;
                            flag = 1;
                        } else {
                            a[i] = previousValue;
                            flag = 1;
                        }
                    }
                    j++;
                }
            }
        }
    }
}

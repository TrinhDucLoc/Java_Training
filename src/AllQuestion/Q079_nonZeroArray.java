package AllQuestion;

public class Q079_nonZeroArray {
    public static void main(String[] args) {
        System.out.println(nonZeroArray(new int[]{1, 2, 3}));
        System.out.println(nonZeroArray(new int[]{1, 0, 4, 0}));
        System.out.println(nonZeroArray(new int[]{1, 2, 3, 0}));
        System.out.println(nonZeroArray(new int[]{0, 0, 0}));
        System.out.println(nonZeroArray(new int[]{}));
    }

    static int nonZeroArray(int[] a) {
        for(int i=0; i<a.length; i++) {
            if(a[i] == 0) {it ad
                return 0;
            }
        }
        return 1;
    }
}

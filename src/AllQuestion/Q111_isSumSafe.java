package AllQuestion;

public class Q111_isSumSafe {
    public static void main(String[] args) {
        System.out.println(isSumSafe(new int[]{5, -5, 0}));
        System.out.println(isSumSafe(new int[]{5, -2, 1}));
        System.out.println(isSumSafe(new int[]{}));
    }

    static int isSumSafe(int[] a) {
//        validate
        if(a.length < 1) {
            return 0;
        }

        int sumValue = 0;
        for(int i=0; i<a.length; i++) {
            sumValue += a[i];
        }
        for(int i=0; i<a.length; i++) {
            if(sumValue == a[i]) {
                return 0;
            }
        }
        return 1;
    }
}

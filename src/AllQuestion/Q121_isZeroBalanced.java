package AllQuestion;

public class Q121_isZeroBalanced {
    public static void main(String[] args) {
        System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalanced(new int[]{-3, -3, -3}));
        System.out.println(isZeroBalanced(new int[]{3}));
        System.out.println(isZeroBalanced(new int[]{}));
    }

    static int isZeroBalanced(int[] a) {
        if(a.length < 1) {
            return 0;
        }
        int sumValue = 0;

        for(int i=0; i<a.length; i++) {
            sumValue += a[i];
            int flagBalance = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == -a[j]) {
                    flagBalance = 1;
                    break;
                }
            }
            if(flagBalance == 0) {
                return 0;
            }
        }

        if(sumValue != 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

package AllQuestion;

public class Q118_isVanilla {
    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1, 1, 11, 1111, 1111111}));
        System.out.println(isVanilla(new int[]{11, 101, 1111, 11111}));
        System.out.println(isVanilla(new int[]{11, 222, 1111, 11111}));
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
    }

    static int isVanilla(int[] a) {
        for(int i=0; i<a.length; i++) {
            int sameDigit = a[0] % 10;

            int tempN = a[i];
            while(tempN > 0) {
                int lastDigit = tempN % 10;
                if(lastDigit != sameDigit) {
                    return 0;
                }
                tempN /= 10;
            }
        }
        return 1;
    }
}

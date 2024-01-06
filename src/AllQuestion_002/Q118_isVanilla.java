package AllQuestion_002;

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

    public static int isVanilla(int[] a) {
        if(a.length == 0) {
            return 1;
        }

        int firstDigit = a[0] % 10;
        for(int i=0; i<a.length; i++) {
            int tempValue = a[i];
            if(a[i] < 0) {
                tempValue *= -1;
            }

            while(tempValue > 0) {
                int lastDigit = tempValue % 10;
                tempValue /= 10;

                if(lastDigit != firstDigit) {
                    return 0;
                }
            }
        }

        return 1;
    }
}

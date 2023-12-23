package AllQuestion_002;

public class Q029_isDaphne {
    public static void main(String[] args) {
        System.out.println(isDaphne1(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}));
        System.out.println(isDaphne1(new int[]{2, 4, 6, 8, 6}));
        System.out.println(isDaphne1(new int[]{2, 8, 7, 10, -4, 6}));

    }

    public static int isDaphne(int[] a) {
        int flagOdd = 0;
        if(a[0] % 2 != 0) {
            flagOdd = 1;
        }

        for(int i=0; i<a.length; i++) {
            if(flagOdd == 1 && a[i] % 2 == 0) {
                return 0;
            }
            if(flagOdd == 0 && a[i] % 2 != 0) {
                return 0;
            }
        }

        return 1;
    }

    public static int isDaphne1(int[] a) {
        int flagOdd = 0;
        int left = 0, right = a.length - 1;

        while(left <= right) {
            if(a[left] % 2 == 0 && a[right] % 2 != 0 || a[left] % 2 != 0 && a[right] % 2 == 0) {
                return 0;
            }
            left++;
            right--;

            if(a[left] % 2 != 0 || a[right] % 2 != 0){
                flagOdd = 1;
            }
        }
        if(flagOdd == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

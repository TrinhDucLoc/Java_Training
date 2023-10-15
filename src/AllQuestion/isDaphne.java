package AllQuestion;

public class isDaphne {
    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}));
        System.out.println(isDaphne(new int[]{2, 4, 6, 8, 6}));
        System.out.println(isDaphne(new int[]{2, 8, 7, 10, -4, 6}));
    }

    static int isDaphne(int[] a) {
        int flagOdd = 0;
        for(int i=0, j=a.length-1; i<=j; i++,j--) {
            if((a[i] % 2 == 0 & a[j] % 2 != 0) || (a[i] % 2 != 0 && a[j] % 2 == 0)) {
                return 0;
            }
            if(a[i] % 2 != 0 || a[j] % 2 != 0) {
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

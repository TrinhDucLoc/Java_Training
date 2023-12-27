package AllQuestion_002;

public class Q083_isOddValent {
    public static void main(String[] args) {
        System.out.println(isOddValent(new int[]{9, 3, 4, 9, 1}));
        System.out.println(isOddValent(new int[]{3, 3, 3, 3}));
        System.out.println(isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2}));
        System.out.println(isOddValent(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isOddValent(new int[]{2, 2, 2, 4, 4}));
    }

    public static int isOddValent(int[] a) {
        int flagDouble = 0;
        int flagOdd = 0;

        for(int i=0; i<a.length-1; i++) {
            if(a[i] % 2 != 0 || a[i+1] % 2 != 0) {
                flagOdd = 1;
            }
            for(int j=i+1; j<a.length; j++) {
                if(a[i] == a[j]) {
                    flagDouble = 1;
                }
            }
        }

        if(flagOdd == 1 && flagDouble == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

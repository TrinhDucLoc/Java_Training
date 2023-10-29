package AllQuestion;

public class Q122_isZeroLimited {
    public static void main(String[] args) {
        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0}));
        System.out.println(isZeroLimited(new int[]{0, 1}));
        System.out.println(isZeroLimited(new int[]{5}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{}));
    }

    static int isZeroLimited(int[] a) {
//        i. a[3*n+1] is 0 for n>=0 where 3*n+1 is less than the number of elements in the array.
        int n = 0;
        for(int i=0; i<a.length; i++) {
            if(i == 3*n+1 && a[i] != 0) {
                return 0;
            }

            if(i != 3*n+1 && a[i] == 0) {
                return 0;
            }

            if(i == 3*n+1 && a[i] == 0){
                n++;
            }

        }

        return 1;
//        ii. if i != 3*n+1 for some n, then a[i] does not equal 0
    }
}

package AllQuestion_002;

public class Q102_isSequentiallyBounded {
    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));
        System.out.println(isSequentiallyBounded(new int[]{0}));
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
    }

    public static int isSequentiallyBounded(int[] a) {
//        validation
        if(a.length == 0) {
            return 1;
        }

        if(a.length == 1 && a[0] <= 1) {
            return 0;
        }

        int j;
        for(int i=0; i<a.length-1; i = j+1) {
            if(a[i] <= 0) {
                return 0;
            }
            int countNum = 1;
            for(j=i+1; j<a.length; j++) {
                if(a[i] > a[j]) {
                    return 0;
                }
                if(a[i] == a[j]) {
                    countNum++;
                }
                if(a[i] != a[j]) {
                    break;
                }
            }
            if(countNum >= a[i]) {
                return 0;
            }
        }
        return 1;
    }
}

package AllQuestion;

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

    static int isSequentiallyBounded(int[] a) {
        if(a.length == 0) {
            return 1;
        }
        if(a[0] <= 0) {
            return 0;
        }

        int count = 1;
        for(int i=0; i<a.length-1; i++) {
            if(a[i] > a[i+1]) {
                return 0;
            }

            if(a[i] == a[i+1]) {
                count++;
            } else {
                count = 1;
            }
            if(a[i] <= count) {
                return 0;
            }
        }
        return 1;
    }
}

// ascending order and each value, n, in
// the array occurs less than n times in the array

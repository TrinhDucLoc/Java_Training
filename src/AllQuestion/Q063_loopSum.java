package AllQuestion;

public class Q063_loopSum {
    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1,2,3}, 2));
        System.out.println(loopSum(new int[]{-1,2,-1}, 7));
        System.out.println(loopSum(new int[]{1,4,5,6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }

    static int loopSum(int[] a, int n) {
//        validate
        if(n <= 0 || a.length < 1) {
            return 0;
        }
//        solution
        int sumValue = 0;
        int key = 0;
        for(int i=0; i<n; i++) {
            sumValue += a[key];
            key++;
            if(key == a.length) {
                key = 0;
            }
        }
        return sumValue;
    }
}

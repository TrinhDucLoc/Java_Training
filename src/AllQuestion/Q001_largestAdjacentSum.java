package AllQuestion;

public class Q001_largestAdjacentSum {
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }

    static int largestAdjacentSum(int[] a) {
//        validate
        if(a.length < 2) {
            return 0;
        }

//        solution
        int sum = a[0] + a[1];
        for(int i=1; i<a.length-1; i++) {
            if(a[i] + a[i+1] > sum) {
                sum = a[i] + a[i+1];
            }
        }
        return sum;
    }

    static int largestAdjacentSum1(int[] a) {
        if(a.length < 2) {
            return 0;
        }

        int sum = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++) {
            if(a[i] + a[i+1] > sum) {
                sum = a[i] + a[i+1];
            }
        }
        return sum;
    }
}

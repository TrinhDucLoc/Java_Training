package AllQuestion_002;

public class Q001_largestAdjacentSum {
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1} ));
    }

    public static int largestAdjacentSum(int[] a) {
        int largestValue = Integer.MIN_VALUE;

        for(int i=0; i<a.length-1; i++) {
            largestValue = Math.max(largestValue, a[i] + a[i+1]);
        }

        return largestValue;
    }
}

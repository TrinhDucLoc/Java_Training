package AllQuestion_002;

public class Q063_loopSum {
    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }

    public static int loopSum(int[] a, int n) {
        int sumValue = 0;
        int index = 0;

        for(int i=0; i<n; i++) {
            sumValue += a[index];
            if(index == a.length-1) {
                index = 0;
            } else {
                index++;
            }
        }

        return sumValue;
    }
}

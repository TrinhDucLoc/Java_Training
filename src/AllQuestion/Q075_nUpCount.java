package AllQuestion;

public class Q075_nUpCount {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2}, 5));
    }

    static int nUpCount(int[] a, int n) {
        int previousSum = a[0];
        int currentSum = 0;
        int count = 0;
        for(int i=1; i<a.length; i++) {
            currentSum = a[i] + previousSum;
            if(previousSum <= 5 && currentSum > 5) {
                count++;
            }
            previousSum = currentSum;
        }
        return count;
    }
}

package Test1_T1;

public class Q2_nUpCount {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2},5));
        System.out.println(nUpCount(new int[]{1,2,-1,5,3,2,-3}, 20));
    }

    static int nUpCount(int[] a, int n) {
        int sumPartial = 0;
        int nextSumPartial = 0;
        int count = 0;

        for(int i=0; i<a.length - 1; i++) {
            sumPartial += a[i];
            nextSumPartial = sumPartial + a[i+1];
            if(sumPartial <= n && nextSumPartial > n) {
                count++;
            }
        }

        return count;
    }
}

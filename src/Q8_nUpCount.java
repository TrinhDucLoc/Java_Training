public class Q8_nUpCount {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2}, 5));
    }

    static int nUpCount(int[] a, int n) {
        int count = 0;
        int previousSumArray = a[0];
        int currentSumArray = 0;

        for(int i=1; i<a.length; i++) {
            currentSumArray = previousSumArray + a[i];
            if(previousSumArray <= 5 && currentSumArray > 5) {
                count++;
            }
            previousSumArray = currentSumArray;
        }
        return count;
    }
}

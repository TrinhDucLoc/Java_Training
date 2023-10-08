public class Q24_isSub {
    public static void main(String[] args){
        System.out.println(isSub(new int[]{13, 6, 3, 2}));
        System.out.println(isSub(new int[]{11,5,3,2}));
    }

    static int isSub(int[] a) {
        int flagIsSub = 1;
        for(int i=0; i<a.length - 1; i++) {
            int sumSubArray = 0;
            for(int j=i+1; j<a.length; j++){
                sumSubArray += a[j];
                if(a[i] <= sumSubArray) {
                    flagIsSub = 0;
                    return flagIsSub;
                }
            }
        }
        return flagIsSub;
    }
}

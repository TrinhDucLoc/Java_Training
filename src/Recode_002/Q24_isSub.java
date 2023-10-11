package Recode_002;

public class Q24_isSub {
    public static void main(String[] args) {
        System.out.println(isSub(new int[]{13,6,3,2}));
        System.out.println(isSub(new int[]{11,5,3,2}));
    }

    static int isSub(int[] a) {
        int flagIsSub = 1;

        for(int i=0; i<a.length - 1; i++) {
            int sumSub = 0;
            for(int j=i+1; j<a.length; j++) {
                sumSub += a[j];
            }
            if(a[i] <= sumSub) {
                flagIsSub = 0;
                return flagIsSub;
            }
        }
        return flagIsSub;
    }
}

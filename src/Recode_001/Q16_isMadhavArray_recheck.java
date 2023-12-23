package Recode_001;

public class Q16_isMadhavArray_recheck {
    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2,1,1}));
        System.out.println(isMadhavArray(new int[]{2,1,1,4,-1,-1}));
        System.out.println(isMadhavArray(new int[]{6,2,4,2,2,2,1,5,0,0}));
        System.out.println(isMadhavArray(new int[]{18,9,10,6,6,6}));
        System.out.println(isMadhavArray(new int[]{-6,-3,-3,8,-5,-4}));
        System.out.println(isMadhavArray(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}));
        System.out.println(isMadhavArray(new int[]{3,1,2,3,0}));
    }

    static int isMadhavArray(int[] a) {
        int flagConditionLength = 0;

        for(int i=0; i<a.length; i++) {
            if(a.length == i*(i+1)/2) {
                flagConditionLength = 1;
                break;
            }
        }

        if(flagConditionLength == 0) {
            return 0;
        }

        int round = 1;
        int start = 1;
        int end = start + round;
        int firstValue = a[0];
        int flagIsMadhavArray = 1;

        while(flagIsMadhavArray == 1 && end <=  a.length) {
            int sumValue = 0;
            for(int i=start; i<=end; i++) {
                sumValue += a[i];
            }
            if(firstValue == sumValue) {
                round++;
                start = end + 1;
                end = start + round;
            } else {
                flagIsMadhavArray = 0;
                break;
            }
        }
        return flagIsMadhavArray;
    }
}

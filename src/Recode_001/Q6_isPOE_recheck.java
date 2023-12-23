package Recode_001;

public class Q6_isPOE_recheck {
    public static void main(String[] args) {
        System.out.println(checkPOE(new int[]{1,8,3,7,10,2}));
        System.out.println(checkPOE(new int[]{1,5,3,1,1,1,1,1,1}));
        System.out.println(checkPOE(new int[]{2,1,1,1,2,1,7}));
        System.out.println(checkPOE(new int[]{1,2,3}));
        System.out.println(checkPOE(new int[]{3,4,5,10}));
        System.out.println(checkPOE(new int[]{1,2,10,3,4}));
    }

    static int checkPOE(int[] a){
        int left = 0;
        int right = a.length - 1;
        int sumLeft = a[left];
        int sumRight = a[right];
        int idx = 0;
        for(int i=1; i<a.length - 2; i++) {
            if(sumLeft < sumRight) {
                left++;
                sumLeft += a[left];
                idx = left + 1;
            } else {
                right--;
                sumRight += a[right];
                idx = right - 1;
            }
        }
        if(sumLeft == sumRight) {
            return idx;
        } else {
            return -1;
        }
    }
}

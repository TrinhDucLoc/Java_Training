package Recode_001;

public class Q25_isSym {
    public static void main(String[] args) {
        System.out.println(isSym(new int[]{2,7,9,10,11,5,8}));
        System.out.println(isSym(new int[]{9,8,7,13,14,17}));
        System.out.println(isSym(new int[]{2,7,8,9,11,13,10}));
        System.out.println(isSym(new int[]{}));
    }

    static int isSym(int[] a) {
        int leftIndex = 0;
        int rightIndex = a.length - 1;

        for(int i=0; i<a.length/2; i++) {
            if((a[leftIndex] % 2 == 0 && a[rightIndex] % 2 != 0) || (a[leftIndex] % 2 != 0 && a[rightIndex] % 2 == 0)) {
                return 0;
            } else {
                leftIndex++;
                rightIndex--;
            }
        }
        return 1;
    }
}

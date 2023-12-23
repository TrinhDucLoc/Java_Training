package Recode_001;

public class Q21_stantonMeasure {
    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{3,1,1,4}));
        System.out.println(stantonMeasure(new int[]{1,3,1,1,3,3,2,3,3,3,4}));
        System.out.println(stantonMeasure(new int[]{}));
    }

    static int stantonMeasure(int[] a) {
        int countOne = 0;
        int countNum = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] == 1) {
                countOne++;
            }
        }
        for(int i=0; i<a.length; i++) {
            if(a[i] == countOne) {
                countNum++;
            }
        }

        return countNum;
    }
}

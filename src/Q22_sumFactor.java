public class Q22_sumFactor {
    public static void main(String[] args){
        System.out.println(sumFactor(new int[]{3,0,2,-5,0}));
        System.out.println(sumFactor(new int[]{9,-3,-3,-1,-1}));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0,0,0}));
        System.out.println(sumFactor(new int[]{}));
    }

    static int sumFactor(int[] a) {
        if(a.length == 0) {
            return 0;
        }

        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }

        int count = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] ==  sum) {
                count++;
            }
        }

        return count;
    }
}

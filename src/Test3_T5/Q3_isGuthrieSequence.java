package Test3_T5;

public class Q3_isGuthrieSequence {
    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1} ));
        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2}));
    }

    static int isGuthrieSequence(int[] a) {
//        validate
        if(a[0] <= 0 || a[a.length - 1] != 1) {
            return 0;
        }
//        solution
        for(int i=0; i<a.length-1; i++) {
            if(a[i] % 2 == 0 && a[i+1] != a[i]/2) {
                return 0;
            } else if(a[i] % 2 != 0 && a[i+1] != a[i]*3+1) {
                return 0;
            }
        }
        return 1;
    }
}

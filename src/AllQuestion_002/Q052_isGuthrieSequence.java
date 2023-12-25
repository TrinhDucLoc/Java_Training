package AllQuestion_002;

public class Q052_isGuthrieSequence {
    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1} ));
        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 1} ));
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2} ));
    }

    public static int isGuthrieSequence(int[] a) {
//        Start with a positive number n
//        if n is even then divide by 2
//        if n is odd then multiply by 3 and add 1
//        continue this until n becomes 1

        if((a[0] <= 0) || (a[a.length-1] != 1)) {
            return 0;
        }

        for(int i=0; i<a.length-1; i++) {
            if(a[i] % 2 == 0 && a[i+1] != a[i]/2) {
                return 0;
            }

            if(a[i] % 2 != 0 && a[i+1] != a[i]*3+1) {
                return 0;
            }
        }

        return 1;
    }
}

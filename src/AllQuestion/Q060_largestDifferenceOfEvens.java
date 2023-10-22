package AllQuestion;

public class Q060_largestDifferenceOfEvens {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9} ));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4} ));
    }

    static int largestDifferenceOfEvens(int[] a) {
        int flagEven = 0;
        int diffEven = 0;
        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] % 2 == 0 && a[j] % 2 == 0) {
                    flagEven = 1;
                    int sumValue = 0;
                    if(a[j] > a[i]) {
                        sumValue = a[j] - a[i];
                    } else {
                        sumValue = a[i] - a[j];
                    }
                    if(diffEven < sumValue) {
                        diffEven = sumValue;
                    }
                }
            }
        }
        if(flagEven == 0) {
            return -1;
        }
        return diffEven;
    }
}

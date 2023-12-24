package AllQuestion_002;

public class Q060_largestDifferenceOfEvens {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{-2, 3, 4, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }

    public static int largestDifferenceOfEvens(int[] a) {
        int largestEven = 0;
        int minEven = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        int countEven = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0) {
                if(minEven > a[i]) {
                    minEven = a[i];
                }
                if(maxEven < a[i]) {
                    maxEven = a[i];
                }
                countEven++;
            }

            if(maxEven - minEven > largestEven) {
                largestEven = maxEven - minEven;
            }
        }

        if(countEven < 2) {
            return -1;
        }

        return largestEven;
    }
}

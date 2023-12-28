package AllQuestion_002;

public class Q091_countSquarePairs {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7} ));
        System.out.println(countSquarePairs(new int[]{9}));
    }

    public static int countSquarePairs(int[] a) {
        if(a.length < 2) {
            return 0;
        }

        int countPair = 0;

        for(int i=0; i<a.length-1; i++) {
            if(a[i] <= 0) {
                continue;
            }
            for(int j=i+1; j<a.length; j++) {
                if(a[j] <= 0) {
                    continue;
                }
                if(isPerfectSquare(a[i] + a[j]) == 1) {
                    countPair++;
                }
            }
        }

        return countPair;
    }

    public static int isPerfectSquare(int n) {
        if(n < 0) {
            return 0;
        }

        for(int i=0; i<=n; i++) {
            if(i*i == n) {
                return 1;
            }
        }

        return 0;
    }
}

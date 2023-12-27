package AllQuestion_002;

public class Q074_isNUnique {
    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));
        System.out.println(isNUnique(new int[]{1}, 4));
    }

    public static int isNUnique(int[] a, int n) {
        if(a.length < 2) {
            return 0;
        }

        int countPair = 0;

        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] + a[j] == n) {
                    countPair++;
                }
            }
        }

        if(countPair == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

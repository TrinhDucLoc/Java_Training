package AllQuestion;

public class Q074_isNUnique {
    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));
        System.out.println(isNUnique(new int[]{1}, 4));
    }

    static int isNUnique(int[] a, int n) {
//        validate
        if(a.length<2) {
            return 0;
        }
//        solution
        int countAll = 0;
        for(int i=0; i<a.length; i++) {
            int count = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] + a[j] == n && i != j) {
                    count++;
                }
            }
            if(count > 1){
                return 0;
            }
            if(count > 0) {
                countAll++;
            }
        }
        if(countAll == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

package AllQuestion;

public class Q076_hasNValues {
    public static void main(String[] args) {
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
    }

    static int hasNValues(int[] a, int n) {
        if(a.length == 1){
            return 1;
        }
        if(a.length == 0) {
            return 0;
        }

        int lengthNoDuplicateArray = a.length;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++) {
                if(a[i] == a[j]) {
                    lengthNoDuplicateArray--;
                    break;
                }
            }
        }
        if(lengthNoDuplicateArray == n) {
            return 1;
        } else {
            return 0;
        }
    }
}

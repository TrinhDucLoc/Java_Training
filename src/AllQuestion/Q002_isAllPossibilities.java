package AllQuestion;

public class Q002_isAllPossibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3}));
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0}));
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3}));
        System.out.println(isAllPossibilities(new int[]{0, 2, 3}));
        System.out.println(isAllPossibilities(new int[]{0}));
        System.out.println(isAllPossibilities(new int[]{}));
    }

    static int isAllPossibilities(int[] a){
//        validate
        if(a.length == 0) {
            return 0;
        }

//        solution
        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i=0; i<a.length; i++) {
            if(a[i] != i) {
                return 0;
            }
        }
        return 1;
    }
}

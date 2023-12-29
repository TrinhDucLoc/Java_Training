package AllQuestion_002;

public class Q103_isSetEqual {
    public static void main(String[] args) {
        System.out.println(isSetEqual(new int[]{9, 1, 12, 1}, new int[]{1, 9, 12, 9, 12, 1, 9}));
        System.out.println(isSetEqual(new int[]{9, 1, 12, 1}, new int[]{1, 9, 12, 9, 12, 1, 9, 10}));
        System.out.println(isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 1}));
        System.out.println(isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 6}));
    }

    public static int isSetEqual(int[] a, int[] b) {
        for(int i=0; i<a.length; i++) {
            int flagEqual = 0;
            for(int j=0; j<b.length; j++) {
                if(a[i] == b[j]) {
                    flagEqual = 1;
                    break;
                }
            }
            if(flagEqual == 0) {
                return 0;
            }
        }

        for(int i=0; i<b.length; i++) {
            int flagEqual = 0;
            for(int j=0; j<a.length; j++) {
                if(b[i] == a[j]) {
                    flagEqual = 1;
                    break;
                }
            }
            if(flagEqual == 0) {
                return 0;
            }
        }

        return 1;
    }
}

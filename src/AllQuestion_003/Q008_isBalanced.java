package AllQuestion_003;

public class Q008_isBalanced {
    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2}));
        System.out.println(isBalanced(new int[]{-5, 2, -2}));
    }

    public static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int flagBalance = 0;
            for(int j = 0; j < a.length;  j++) {
                if (a[i] == -a[j]) {
                    flagBalance = 1;
                    break;
                }
            }
            if(flagBalance == 0) {
                return 0;
            }
        }
        return 1;
    }
}

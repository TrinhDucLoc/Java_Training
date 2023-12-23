package AllQuestion_002;

public class Q008_isBalanced {
    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2}));
        System.out.println(isBalanced(new int[]{-5, 2, -2}));
    }

    public static int isBalanced(int[] a){
        for(int i=0; i<a.length; i++) {
            int isBalanced = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == -a[j]) {
                    isBalanced = 1;
                    break;
                }
            }
            if(isBalanced == 0) {
                return 0;
            }
        }
        return 1;
    }
}

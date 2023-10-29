package AllQuestion;

public class Q114_isTriple {
    public static void main(String[] args) {
        System.out.println(isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println(isTriple(new int[]{2, 5, 2, 5, 5, 2, 5}));
        System.out.println(isTriple(new int[]{3, 1, 1, 1}));
    }

    static int isTriple(int[] a) {

        for(int i=0; i<a.length; i++) {
            int count = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == a[j]) {
                    count++;
                }
            }
            if(count != 3) {
                return 0;
            }
        }
        return 1;
    }
}

package AllQuestion;

public class Q078_isNice {
    public static void main(String[] args) {
        System.out.println(isNice(new int[]{2, 10, 9, 3}));
        System.out.println(isNice(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isNice(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isNice(new int[]{0, -1, 1}));
        System.out.println(isNice(new int[]{3, 4, 5, 7}));
    }

    static int isNice(int[] a) {
        for(int i=0; i<a.length; i++) {
            int flag = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == a[j]-1 || a[i] == a[j]+1) {
                    flag = 1;
                }
            }
            if(flag == 0) {
                return 0;
            }
        }
        return 1;
    }
}

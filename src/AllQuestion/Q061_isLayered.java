package AllQuestion;

public class Q061_isLayered {
    public static void main(String[] args) {
        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3} ));
        System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3} ));
        System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3} ));
        System.out.println(isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}));
        System.out.println(isLayered(new int[]{2} ));
        System.out.println(isLayered(new int[]{}));
    }

    static int isLayered(int[] a) {
//        validate
        if(a.length < 2) {
            return 0;
        }

        int countNum = 1;
        for(int i=0; i<a.length-1; i++) {
            if(a[i] > a[i+1]) {
                return 0;
            }
            if(a[i] == a[i+1]) {
                countNum++;
            } else {
                if(countNum < 2) {
                    return 0;
                }
                countNum = 1;
            }
        }
        return 1;
    }
}

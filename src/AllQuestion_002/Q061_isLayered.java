package AllQuestion_002;

public class Q061_isLayered {
    public static void main(String[] args) {
        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}));
        System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}));
        System.out.println(isLayered(new int[]{2}));
        System.out.println(isLayered(new int[]{}));
    }

    public static int isLayered(int[] a) {
//        validation
        if(a.length == 0) {
            return 0;
        }
        int count = 1;
        for(int i=0; i<a.length; i++) {
            if(i == a.length-1) {
                if(count < 2) {
                    return 0;
                } else {
                    break;
                }
            }

            if(a[i] == a[i+1]) {
                count++;
            }
            if(a[i] != a[i+1] && a[i] > a[i+1]) {
                return 0;
            }
            if(a[i] != a[i+1]) {
                if(count < 2) {
                    return 0;
                } else {
                    count = 1;
                }
            }
        }
        return 1;
    }
}

package AllQuestion_002;

public class Q115_isTrivalent {
    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
    }

    public static int isTrivalent(int[] a) {
//        validation
        if(a.length < 3) {
            return 0;
        }

        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] > a[j]) {
                    int tempValue = a[i];
                    a[i] = a[j];
                    a[j] = tempValue;
                }
            }
        }

        int count = 1;

        for(int i=0; i<a.length-1; i++) {
            if(a[i] != a[i+1]) {
                count++;
            }
        }

        if(count == 3) {
            return 1;
        } else {
            return 0;
        }
    }
}

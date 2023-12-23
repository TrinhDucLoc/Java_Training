package AllQuestion_002;

public class Q014_isCentered {
    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isCentered(new int[]{5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(new int[]{1}));
    }

    public static int isCentered(int[] a) {
        if(a.length % 2 == 0) {
            return 0;
        }

        int middleValue = a[a.length/2];

        for(int i=0; i<a.length; i++) {
            if(i==a.length/2) {
                continue;
            }
            if(a[i] <= middleValue) {
                return 0;
            }
        }
        return 1;
    }
}

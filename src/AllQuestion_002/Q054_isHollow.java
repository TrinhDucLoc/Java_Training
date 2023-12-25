package AllQuestion_002;

public class Q054_isHollow {
    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
        System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{0, 0, 0}));
    }

    public static int isHollow(int[] a) {
        int flagZero = 0;
        int countZero = 0;
        int left = 0, right = a.length - 1;
        int mid = (left + right) / 2;

        while(left <= right) {
            if((a[left] != 0 && a[right] == 0) || (a[right] != 0 && a[left] == 0)) {
                return 0;
            }

            if(a[left] == 0) {
                countZero++;
            }

            if(a[right] == 0 && right != mid) {
                countZero++;
            }

            left++;
            right--;
        }

        if(countZero >= 3) {
            return 1;
        } else {
            return 0;
        }
    }
}

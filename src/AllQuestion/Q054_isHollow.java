package AllQuestion;

public class Q054_isHollow {
    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4}));
        System.out.println(isHollow(new int[]{1,1,1,1,0,0,0,0,0,2,1,2,18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4} ));
        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4,5}));
        System.out.println(isHollow(new int[]{3,8,3,0,0,0,3,3}));
        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4,0} ));
        System.out.println(isHollow(new int[]{0,1,2,0,0,0,3,4}));
        System.out.println(isHollow(new int[]{0,0,0} ));
    }

    static int isHollow(int[] a) {
        if(a.length % 2 == 0) {
            return 0;
        }
        int midIndex = a.length/2;
        int countZeros = 0;
        for(int left = 0, right = a.length - 1; left<right; left++, right--) {
            if(a[left] == 0 && a[right] != 0 || a[left] != 0 && a[right] == 0) {
                return 0;
            }
            if(a[left] == 0) {
                countZeros++;
            }
            if(a[right] == 0) {
                countZeros++;
            }
        }
        if(a[midIndex] == 0) {
            countZeros++;
        }

        if(countZeros >= 3) {
            return 1;
        } else {
            return 0;
        }
    }
}

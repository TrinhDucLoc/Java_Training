package AllQuestion;

public class Q112_isSystematicallyIncreasing {
    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
    }

    static int isSystematicallyIncreasing(int[] a) {
        int length = 1;

        int key = 1;
        for(int i=0; i< a.length; i++) {
            if(key < length) {
                if(a[i] != key) {
                    return 0;
                }
                key++;
            } else if(key == length) {
                if(a[i] != key) {
                    return 0;
                }
                key = 1;
                length++;
            }
        }
        return 1;
    }
}

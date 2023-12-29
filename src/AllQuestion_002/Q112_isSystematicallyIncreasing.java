package AllQuestion_002;

public class Q112_isSystematicallyIncreasing {
    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
    }

    public static int isSystematicallyIncreasing(int[] a) {
        int round = 1;
        int index = 1;
        for(int i=0; i<a.length; i++) {
            if(index < round) {
                if(a[i] != index) {
                    return 0;
                }
                index++;
            } else if(index == round) {
                if(a[i] != index) {
                    return 0;
                }
                index = 1;
                round++;
            }
        }
        return 1;
    }
}

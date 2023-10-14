package AllQuestion;

public class isCentered {
    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{1,2,3,4,5}));
        System.out.println(isCentered(new int[]{3,2,1,4,5}));
        System.out.println(isCentered(new int[]{3,2,1,4,1}));
        System.out.println(isCentered(new int[]{1,2,3,4}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(new int[]{10}));
    }

    public static int isCentered(int[] items) {
        if(items.length == 0 || items.length % 2 == 0) {
            return 0;
        }
        int indexMiddle = items.length / 2;
        for(int i=0; i<items.length; i++) {
            if(items[indexMiddle] >= items[i] && i != indexMiddle) {
                return 0;
            }
        }
        return 1;
    }
}

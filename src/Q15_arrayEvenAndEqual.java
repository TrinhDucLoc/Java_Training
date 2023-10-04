public class Q15_arrayEvenAndEqual {
    public static void main(String[] args) {
        System.out.println(arrayEvenAndEqual(new int[]{5,4,3,2,3,4,6,1}));
        System.out.println(arrayEvenAndEqual(new int[]{1,2,1,2}));
        System.out.println(arrayEvenAndEqual(new int[]{0}));
        System.out.println(arrayEvenAndEqual(new int[]{}));
    }

    public static int arrayEvenAndEqual(int[] array) {
//        validate
        if(array.length % 2 != 0 || array.length < 2) {
            return 0;
        }

        int sumLeft = 0;
        int sumRight = 0;
        for(int i=0; i<array.length; i++) {
            if(i < array.length/2) {
                sumLeft += array[i];
            } else {
                sumRight += array[i];
            }
        }
        if(sumLeft == sumRight) {
            return 1;
        } else {
            return 0;
        }
    }
}

package AllQuestion;

public class decodeArray {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0} ));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15} ));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15} ));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
    }

    static int decodeArray(int[] a) {
        int decodeNum = 0;
        int flagNegative = 1;
        if(a[0] < 0) {
            flagNegative = -1;
        }
        for(int i=0; i<a.length-1; i++) {
            int sumItem = a[i] - a[i+1];
            if(sumItem < 0) {
                sumItem = -1 * sumItem;
            }
            decodeNum = decodeNum * 10 + sumItem;
        }
        return decodeNum*flagNegative;
    }
}

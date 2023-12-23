package AllQuestion_002;

public class Q030_decodeArray {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{2, -3, -2, 6, 9, 18}));
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));

        System.out.println();
        System.out.println(decodeArray1(new int[]{1}));
        System.out.println(decodeArray1(new int[]{0, 1}));
        System.out.println(decodeArray1(new int[]{-1, 0, 1}));
        System.out.println(decodeArray1(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray1(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
        System.out.println(decodeArray1(new int[]{0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}));
        System.out.println(decodeArray1(new int[]{-1, 0, 0, 1, 1, 0, 1}));
    }

    public static int decodeArray(int[] a) {
        int isNegativeNum = 1;

        if(a[0] < 0) {
            isNegativeNum = -1;
        }

        int resDigit = 0;
        for(int i=0; i<a.length-1; i++) {
            int currentDigit = a[i] - a[i+1];
            if(currentDigit < 0) {
                currentDigit = -currentDigit;
            }
            resDigit = resDigit*10 + currentDigit;
        }

        return isNegativeNum * resDigit;
    }

    public static int decodeArray1(int[] a) {
        int isNegativeNum = 1;
        if(a[0] < 0) {
            isNegativeNum = -1;
        }
        int countZero = 0;
        int resDigit = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == -1) {
                continue;
            }
            if(a[i] == 0) {
                countZero++;
            } else {
                resDigit = resDigit*10 + countZero;
                countZero = 0;
            }
        }

        return resDigit * isNegativeNum;
    }
}

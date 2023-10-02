public class Q11_isMeera {
    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{7,9,0,10,1}));
        System.out.println(isMeera(new int[]{6,10,8}));
        System.out.println(isMeera(new int[]{7,6,1}));
        System.out.println(isMeera(new int[]{9,10,0}));
        System.out.println(isMeera(new int[]{1,1,0,8,0,9,9,1}));
    }

    public static int isMeera(int[] array) {
        int isOne = 0;
        int isNine = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] == 1) {
                isOne = 1;
            }
            if(array[i] == 9) {
                isNine = 1;
            }
        }
        if((isOne == 1 && isNine == 1) || (isOne == 0 && isNine == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
}

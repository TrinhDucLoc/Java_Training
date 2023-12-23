package Recode_001;

public class Q11_isMeera {
    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{7,9,0,10,1}));
        System.out.println(isMeera(new int[]{6,10,8}));
        System.out.println(isMeera(new int[]{7,6,1}));
        System.out.println(isMeera(new int[]{9,10,0}));
        System.out.println(isMeera(new int[]{1,1,0,8,0,9,9,1}));
    }

    static int isMeera(int[] a) {
        int flagOne = 0;
        int flagNine = 0;
        int flagIsMeera = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] == 1) {
                flagOne = 1;
            }
            if(a[i] == 9) {
                flagNine = 1;
            }
        }

        if((flagOne == 1 && flagNine == 1) || (flagOne != 1 && flagNine != 1)) {
            flagIsMeera = 1;
            return flagIsMeera;
        } else {
            return flagIsMeera;
        }
    }
}

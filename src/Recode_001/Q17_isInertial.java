package Recode_001;

public class Q17_isInertial {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1} ));
        System.out.println(isInertial(new int[]{2} ));
        System.out.println(isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11} ));
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11} ));
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11} ));
        System.out.println(isInertial(new int[]{2, 3, 5, 7}));
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}));
    }

    static int isInertial(int[] a) {
//        condition 1:
        int flagLeastOneOdd = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 != 0) {
                flagLeastOneOdd = 1;
                break;
            }
        }

        if(flagLeastOneOdd == 0) {
            return 0;
        }

//        Condition 2:
        int flagMaxValueIsEven = 0;
        int maxValue = a[0];

        for(int i=1; i<a.length; i++) {
            if(a[i] > maxValue) {
                maxValue = a[i];
            }
        }

        if(maxValue % 2 == 0) {
            flagMaxValueIsEven = 1;
        }

        if(flagMaxValueIsEven == 0) {
            return 0;
        }

//        Condition 3:
        int lengthOddArray = 0;
        int lengthEvenArray = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0) {
                lengthEvenArray++;
            } else {
                lengthOddArray++;
            }
        }

        int[] oddArray = new int[lengthOddArray];
        int keyOdd = 0;
        int[] evenArray = new int[lengthEvenArray];
        int keyEven = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0) {
                evenArray[keyEven] = a[i];
                keyEven++;
            } else {
                oddArray[keyOdd] = a[i];
                keyOdd++;
            }
        }

        int flagOddGreaterThanEvenNotMaxValue = 1;
        for(int i=0; i<lengthOddArray; i++) {
            for(int j=0; j<lengthEvenArray; j++) {
                if(oddArray[i] <= evenArray[j] && evenArray[j] != maxValue) {
                    flagOddGreaterThanEvenNotMaxValue = 0;
                }
            }
        }

        if(flagOddGreaterThanEvenNotMaxValue == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

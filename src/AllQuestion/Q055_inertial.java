package AllQuestion;

public class Q055_inertial {
    public static void main(String[] args) {
        System.out.println(inertial(new int[]{1}));
        System.out.println(inertial(new int[]{2}));
        System.out.println(inertial(new int[]{1,2,3,4}));
        System.out.println(inertial(new int[]{1,1,1,1,1,1,2}));
        System.out.println(inertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(inertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(inertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(inertial(new int[]{2, 3, 5, 7}));
        System.out.println(inertial(new int[]{2, 4, 6, 8, 10} ));
    }

    static int inertial(int[] a) {
        int flagOddValue = 0;
        int flagMaxValueIsEven = 0;
        int lengthOddArray = 0;
        int lengthEvenArray = 0;
//        condition 1:
        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 != 0) {
                flagOddValue = 1;
                lengthOddArray++;
            } else {
                lengthEvenArray++;
            }

        }

//        condition 2:
        int maxValue = a[0];
        for(int i=1; i<a.length; i++) {
            if(a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        if(maxValue % 2 == 0) {
            flagMaxValueIsEven = 1;
        }
        if(flagOddValue == 0 || flagMaxValueIsEven == 0) {
            return 0;
        }

//        condition 3:
        int[] oddArray = new int[lengthOddArray];
        int[] evenArray = new int[lengthEvenArray];
        int oddKey = 0;
        int evenKey = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0) {
                evenArray[evenKey] = a[i];
                evenKey++;
            } else {
                oddArray[oddKey] = a[i];
                oddKey++;
            }
        }

        for(int i=0; i<lengthOddArray; i++) {
            for(int j=0; j<lengthEvenArray; j++) {
                if(oddArray[i] <= evenArray[j] && evenArray[j] != maxValue) {
                    return 0;
                }
            }
        }

        return 1;
    }
}

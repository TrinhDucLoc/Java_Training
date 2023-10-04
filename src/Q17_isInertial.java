public class Q17_isInertial {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1}));
        System.out.println(isInertial(new int[]{2}));
        System.out.println(isInertial(new int[]{1,2,3,4}));
        System.out.println(isInertial(new int[]{1,1,1,1,1,1,2}));
        System.out.println(isInertial(new int[]{2,12,4,6,8,11}));
        System.out.println(isInertial(new int[]{2,12,12,4,6,8,11}));
        System.out.println(isInertial(new int[]{-2,-4,-6,-8,-11}));
        System.out.println(isInertial(new int[]{2,3,5,7}));
        System.out.println(isInertial(new int[]{2,4,6,8,10}));
    }

    public static int isInertial(int[] array) {
        if(array.length <= 1) {
            return 0;
        }
        int flagLeastOddNum = 0;
        int maxValue = array[0];
        int flagMaxValueEven = 0;
        int flagMinOddGreaterAllEvenNotMax = 1;
        int lengthOddArray = 0;
        int lengthEvenArray = 0;

        for(int i=0; i<array.length; i++) {
//            Condition_1: Check least value is odd
            if(array[i] % 2 != 0) {
                flagLeastOddNum = 1;
                lengthOddArray++;
            } else {
                lengthEvenArray++;
            }

//            Condition_2: check max value of array is even
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        if(maxValue % 2 == 0){
            flagMaxValueEven = 1;
        }

//        Condition 3: check min odd greater than second highest even number
        int[] oddArray = new int[lengthOddArray];
        int oddKey = 0;
        int[] evenArray = new int[lengthEvenArray];
        int evenKey = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                evenArray[evenKey] = array[i];
                evenKey++;
            } else {
                oddArray[oddKey] = array[i];
                oddKey++;
            }
        }

        for(int i=0; i<lengthOddArray; i++) {
            for(int j=0; j<lengthEvenArray; j++) {
                if(oddArray[i] < evenArray[j] && evenArray[j] != maxValue) {
                    flagMinOddGreaterAllEvenNotMax = 0;
                }
            }
        }

//        check 3 condition
        if(flagLeastOddNum == 1 && flagMaxValueEven == 1 && flagMinOddGreaterAllEvenNotMax == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}



/*
Condition:
1. it contains at least one odd value
2. the maximum value of array is even
3. the min of odd value greater than second high even value

Validate & testcase:
{1} => 0: maximun value of event
{2} => 0: least one odd value
{
 */

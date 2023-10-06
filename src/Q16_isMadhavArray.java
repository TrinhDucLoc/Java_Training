public class Q16_isMadhavArray {
    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2,1,1}));
        System.out.println(isMadhavArray(new int[]{2,1,1,4,-1,-1}));
        System.out.println(isMadhavArray(new int[]{6,2,4,2,2,2,1,5,0,0}));
        System.out.println(isMadhavArray(new int[]{18,9,10,6,6,6}));
        System.out.println(isMadhavArray(new int[]{-6,-3,-3,8,-5,-4}));
        System.out.println(isMadhavArray(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}));
        System.out.println(isMadhavArray(new int[]{3,1,2,3,0}));
    }

    public static int isMadhavArray(int[] array) {
//        validate
        if(array.length < 3) {
            return 0;
        }

        int flagValidateLength = 0;
        for(int i=1; i<array.length; i++) {
            if(array.length == i*(i + 1)/ 2) {
                flagValidateLength = 1;
                break;
            }
        }
        if(flagValidateLength == 0) {
            return 0;
        }
//        solution
        int firstValue = array[0];
        int round = 1;
        int firstIndex = 1;
        int lastIndex = firstIndex + round;
        int flagMadhav = 1;

        while(flagMadhav == 1 && lastIndex <= array.length) {
            int sumHadhav = 0;
            for(int i=firstIndex; i<=lastIndex; i++) {
                sumHadhav += array[i];
            }
            if(sumHadhav != firstValue) {
                flagMadhav = 0;
                break;
            }
            round++;
            firstIndex = lastIndex + 1;
            lastIndex = firstIndex + round;
        }

        return flagMadhav;
    }
}


/*
Question 16
A Madhav array has the following property.
a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
The length of a Madhav array must be n*(n+1)/2 for some n.
Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
otherwise it returns 0. If you are programming in Java or C# the function signature is
int isMadhavArray(int[] a)
 */

/*
Solution:


 */

import java.util.Arrays;

public class Q5_commonElement {
    public static void main(String[] args) {
        System.out.println(commonElement(new int[]{1,8,3,2}, new int[]{4,2,6,1}));
        System.out.println(commonElement(new int[]{1,8,3,2,6}, new int[]{2,6,1}));
        System.out.println(commonElement(new int[]{1,3,7,9}, new int[]{7,1,9,3}));
        System.out.println(commonElement(new int[]{1,2}, new int[]{3,4}));
        System.out.println(commonElement(new int[]{}, new int[]{1,2,3}));
        System.out.println(commonElement(new int[]{1,2}, new int[]{}));
        System.out.println(commonElement(new int[]{1,2}, null));

    }

    public static String commonElement(int[] firstArray, int[] secondArray) {
//        validate
        if(firstArray == null || secondArray == null) {
            return null;
        }
        if(firstArray.length == 0 || secondArray.length == 0) {
            return Arrays.toString(new int[0]);
        }

//        solution
        int min = 0;
        int[] firstCopyArray;
        int[] secondCopyArray;
        if(firstArray.length > secondArray.length) {
            min = secondArray.length;
            firstCopyArray = secondArray;
            secondCopyArray = firstArray;
        } else {
            min = firstArray.length;
            firstCopyArray = firstArray;
            secondCopyArray = secondArray;
        }

        int[] commonArray = new int[min];
        int cnt = 0;

        for(int i=0; i<firstCopyArray.length; i++) {
            for(int  j=0; j<secondCopyArray.length; j++){
                if(firstCopyArray[i] == secondCopyArray[j]) {
                    commonArray[cnt] = firstCopyArray[i];
                    cnt++;
                }
            }
        }

        int[] commonArrayDeleteZero = new int[cnt];
        for(int i=0; i<cnt; i++) {
            commonArrayDeleteZero[i] = commonArray[i];
        }
        return Arrays.toString(commonArrayDeleteZero);
    }
}


// Solution
// validate
// if(firstArray == null || secondArray == null) => return null
// if(firstArray.length == 0 || secondArray.length == 0) => return new int[0];
// if(firstArray.length > secondArray) => firstCopyArray = secondArray && secondCopyArray = firstArray
// else firstCopyArray = firstArray && secondArray =  secondArray;
// create commonArray to check duplicate element
// loop two array and compare each element => commonArray = firstCopyArray[i]
// return commonArray

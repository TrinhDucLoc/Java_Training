package Recode_002;

public class Q5_commonElement_recheck {
    public static void main(String[] args) {
        System.out.println(commonElement(new int[]{1,8,3,2}, new int[]{4,2,6,1}));
//        System.out.println(commonElement(new int[]{1,8,3,2,6}, new int[]{2,6,1}));
//        System.out.println(commonElement(new int[]{1,3,7,9}, new int[]{7,1,9,3}));
//        System.out.println(commonElement(new int[]{1,2}, new int[]{3,4}));
//        System.out.println(commonElement(new int[]{}, new int[]{1,2,3}));
//        System.out.println(commonElement(new int[]{1,2}, new int[]{}));
//        System.out.println(commonElement(new int[]{1,2}, null));
    }

    static int[] commonElement(int[] first, int[] second) {
        if(first.length == 0 || second.length == 0) {
            return new int[0];
        }

        if(first == null || second == null) {
            return null;
        }

//        Get min length to contructor new array
        int tempLength = 0;
        if(first.length > second.length) {
            tempLength = first.length;
        } else {
            tempLength = first.length;
        }
        int[] tempFirst = new int[tempLength];
        int[] tempSecond = new int[tempLength];
        int[] tempArray = new int[tempLength];
        int k = 0;

        if(first.length > second.length) {
            tempFirst = second;
            tempSecond = first;
        } else {
            tempFirst = first;
            tempSecond = second;
        }

        for(int i=0; i<tempFirst.length; i++) {
            for(int j=0; j<tempSecond.length; j++) {
                if(tempFirst[i] == tempSecond[j]){
                    tempArray[k] = tempFirst[i];
                    k++;
                }
            }
        }

        int[] commonArray = new int[k];
        for(int i=0; i<k; i++){
            commonArray[i] = tempArray[i];
        }

        return commonArray;
    }
}

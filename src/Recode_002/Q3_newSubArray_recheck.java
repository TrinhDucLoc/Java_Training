package Recode_002;

public class Q3_newSubArray_recheck {
    public static void main(String[] args) {
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 0, 4));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 0,3));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 0, 2));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 1, 3));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 1, 2));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, -1, 2));
        System.out.println(newArrayWithStartLengthPosition(new char[]{}, 0, 1));
    }

    static char[] newArrayWithStartLengthPosition(char[] a, int start, int len) {
        if(start < 0 || len < 0 || start + len > a.length) {
            return "null".toCharArray();
        }

        char[] subArray = new char[len];
        int k = 0;

        for(int i=start; i<start+len; i++) {
            subArray[k] = a[i];
            k++;
        }
        return subArray;
    }
}

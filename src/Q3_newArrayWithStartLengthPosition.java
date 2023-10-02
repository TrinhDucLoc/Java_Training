import java.util.Arrays;

public class Q3_newArrayWithStartLengthPosition {
    public static void main(String[] args) {
        System.out.println(newArrayWithStartLengthPosition(new char[] {'a','b','c'}, 0, 4));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 0,3));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 0, 2));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 1, 3));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, 1, 2));
        System.out.println(newArrayWithStartLengthPosition(new char[]{'a','b','c'}, -1, 2));
        System.out.println(newArrayWithStartLengthPosition(new char[]{}, 0, 1));
    }

    public static String newArrayWithStartLengthPosition(char[] a, int start, int len) {
//        validate return null
        if(start < 0 || len < 0 || start + len > a.length) {
            return null;
        }

        char[] charArray = new char[len];
        int j=0;
        for(int i=start; i<(start+len); i++) {
            charArray[j] += a[i];
            j++;
        }
        return Arrays.toString(charArray);
    }
}


//Solution
// if(startPosition + lengthPosition > lengthArray) => return null
// if(startPosition < 0 || lengthPosition < 0) => return null

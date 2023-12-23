package AllQuestion_002;

import java.util.Arrays;

public class Q035_encodeArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));
        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));
    }

    public static int[] encodeArray(int n) {
        if(n == 0) {
            return new int[]{1};
        }

        int tempN = n;
        int lengthArray = 0;
        if(tempN < 0) {
            lengthArray++;
            tempN = -tempN;
        }
        int newNum = 0;
        while(tempN > 0) {
            int lastDigit = tempN % 10;
            tempN /= 10;
            newNum = newNum*10 + lastDigit;
            lengthArray += lastDigit + 1;
        }
        int[] resArray = new int[lengthArray];
        int k = 0;
        if(n < 0) {
            resArray[k] = -1;
            k++;
        }
        while(newNum > 0) {
            int lastDigit = newNum % 10;
            newNum /= 10;
            for(int i=0; i<=lastDigit; i++) {
                if(i!=lastDigit) {
                    resArray[k] = 0;
                    k++;
                } else {
                    resArray[k] = 1;
                    k++;
                }
            }
        }
        return resArray;
    }
}

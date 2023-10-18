package AllQuestion;

import java.util.Arrays;

public class encodeArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));
        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));
    }

    static int[] encodeArray(int n) {
        if(n==0){
            return new int[]{1};
        }

        int tempN = n;
        int flagNegetive = 1;
        int lengthArray = 0;
        if(n < 0) {
            flagNegetive = -1;
            tempN = -n;
            lengthArray++;
        }
        int newN = 0;

        while(tempN > 0) {
            int lastDigit = tempN % 10;
            lengthArray += lastDigit + 1;
            newN = newN*10 + lastDigit;
            tempN /= 10;
        }

//        create encodeArray
        int[] encodeArray = new int[lengthArray];
        int keyArray = 0;
        if(flagNegetive == -1) {
            encodeArray[0] = -1;
            keyArray++;
        }

        while(newN > 0) {
            int lastDigit = newN % 10;
            if(lastDigit == 0) {
                encodeArray[keyArray] = 1;
                keyArray++;
            } else {
                for(int i=0; i<=lastDigit; i++) {
                    if(i == lastDigit) {
                        encodeArray[keyArray] = 1;
                    } else {
                        encodeArray[keyArray] = 0;
                    }
                    keyArray++;
                }
            }
            newN /= 10;
        }
        return encodeArray;
    }
}

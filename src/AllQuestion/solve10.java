package AllQuestion;

import java.util.Arrays;

public class solve10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve10()));
    }

    static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    static int[] solve10(){
        int lengthRes = 2;
        int[] resArray = new int[lengthRes];
        int factorial10 = factorial(10);
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                if(factorial(i) * factorial(j) == factorial10) {
                    resArray[0] = i;
                    resArray[1] = j;
                    return resArray;
                }
            }
        }
        return resArray;
    }
}

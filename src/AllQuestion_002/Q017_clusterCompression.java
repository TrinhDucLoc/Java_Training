package AllQuestion_002;

import java.util.Arrays;
import java.util.Collections;

public class Q017_clusterCompression {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }

    public static int[] clusterCompression(int[] a) {
        if(a.length == 0) {
            return new int[]{};
        }

        int lengthResArray = 0;
        for(int i=0; i<a.length-1; i++) {
            if(a[i] != a[i+1]){
                lengthResArray++;
            }
        }
        lengthResArray++;

        int[] resArray = new int[lengthResArray];
        int k=0;
        for(int i=0; i<a.length; i++) {
            if(i<a.length-1 && a[i] != a[i+1]){
                resArray[k] = a[i];
                k++;
            }
            if(i == a.length-1) {
                resArray[k] = a[i];
            }
        }
        return resArray;
    }
}

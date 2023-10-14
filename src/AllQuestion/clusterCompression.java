package AllQuestion;

import java.util.Arrays;

public class clusterCompression {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }

    static int[] clusterCompression(int[] a) {
//        validate
        if(a.length == 0) {
            return new int[]{};
        }

//        solution
        int lengthClusterArray = a.length;
        for(int i=0; i<a.length - 1; i++) {
            if(a[i] == a[i+1]) {
                lengthClusterArray--;
            }
        }

        int[] clusterArray = new int[lengthClusterArray];
        int key = 0;
        for(int i=0; i<a.length-1; i++) {
            if(a[i] != a[i+1]) {
                clusterArray[key] = a[i];
                key++;
            }
        }
        clusterArray[lengthClusterArray-1] = a[a.length-1];
        return clusterArray;
    }
}

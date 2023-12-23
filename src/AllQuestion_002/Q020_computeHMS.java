package AllQuestion_002;

import java.util.Arrays;

public class Q020_computeHMS {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }

    public static int[] computeHMS(int seconds) {
        int[] arr = new int[3];

//        1 minutes = 60 seconds
//        1 hours = 60 minutes = 3600 seconds

        int hour = seconds/3600;
        int minute = (seconds % 3600)/60;
        int secondTime = (seconds % 3600) % 60;

        arr[0] = hour;
        arr[1] = minute;
        arr[2] = secondTime;

        return arr;
    }
}

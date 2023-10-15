package AllQuestion;

import java.util.Arrays;

public class computeHMS {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS((0))));
    }

    static int[] computeHMS(int seconds) {
        int lengthComputeHMS = 3;
        int[] arr = new int[lengthComputeHMS];

        int hour = seconds / 3600;
        arr[0] = hour;
        seconds = seconds % 3600;

        int minute = seconds / 60;
        arr[1] = minute;

        seconds = seconds % 60;
        arr[2] = seconds;

        return arr;
    }
}

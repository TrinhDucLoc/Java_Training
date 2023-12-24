package AllQuestion_002;

public class Q064_isMadhavArray {
    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }

    public static int isMadhavArray(int[] a) {
//        validation
        int round = 1;
        int start = 1;
        int end = start + round;
        int firstValue = a[0];
        int sumValue = 0;
        int flag = 0;

        for(int i=1; i<a.length; i++) {
            if(a.length == i*(i+1)/2) {
                flag = 1;
            }

            if(i != end) {
                sumValue += a[i];
            } else {
                sumValue += a[i];
                if(firstValue != sumValue) {
                    return 0;
                }
                sumValue = 0;
                round++;
                start = end+1;
                end = start+round;
            }
        }
        if(flag == 1) {
            return 1;
        }
        return 0;
    }
}

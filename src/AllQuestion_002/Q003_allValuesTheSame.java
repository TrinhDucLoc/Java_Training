package AllQuestion_002;

public class Q003_allValuesTheSame {
    public static void main(String[] args) {
        System.out.println(allValuesTheSame(new int[]{1, 1, 1, 1}));
        System.out.println(allValuesTheSame(new int[]{83, 83, 83}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(allValuesTheSame(new int[]{1, -2343456, 1, -2343456}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, -1}));
        System.out.println(allValuesTheSame(new int[]{432123456}));
        System.out.println(allValuesTheSame(new int[]{-432123456}));
        System.out.println(allValuesTheSame(new int[]{}));
    }

    public static int allValuesTheSame(int[] a) {
        // Validation
        if(a.length == 0) {
            return 0;
        }

        if(a.length == 1) {
            return 1;
        }

        for(int i=0; i<a.length-1; i++) {
            if(a[i] != a[i+1]) {
                return 0;
            }
        }

        return 1;
    }
}

package AllQuestion_003;

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
        // validation
        if(a.length == 0) {
            return 0;
        }

        if(a.length == 1) {
            return 1;
        }

        // solution
        for(int i=0; i<a.length; i++) {
            if(a[0] != a[i]) {
                return 0;
            }
        }

        return 1;
    }
}

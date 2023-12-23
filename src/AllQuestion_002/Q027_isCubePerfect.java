package AllQuestion_002;

public class Q027_isCubePerfect {
    public static void main(String[] args) {
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }

    public static int isCubePerfect(int[] a) {
//        Validation
        if(a.length < 0) {
            return 1;
        }

        for(int i=0; i<a.length; i++) {
            int flagCubeNum = 0;

            if(a[i] < 0) {
                a[i] = -a[i];
            }

            for(int j=0; j<=a[i]; j++) {
                if(j*j*j == a[i]) {
                    flagCubeNum = 1;
                    break;
                }
            }

            if(flagCubeNum == 0) {
                return 0;
            }
        }

        return 1;
    }
}

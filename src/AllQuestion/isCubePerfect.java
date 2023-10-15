package AllQuestion;

public class isCubePerfect {
    public static void main(String[] args) {
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1,0,1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }

    static int isCubePerfect(int[] a) {
//        validate
//        if(a.length == 0){
//            return 1;
//        }


        for(int i=0; i<a.length; i++) {
            if(a[i] < 0) {
                a[i] = -a[i];
            }

            int flagCube = 0;
            for(int j=0; j<=a[i]; j++) {
                if(j*j*j == a[i]) {
                    flagCube = 1;
                    break;
                }
            }

            if(flagCube == 0) {
                return 0;
            }
        }
        return 1;
    }
}

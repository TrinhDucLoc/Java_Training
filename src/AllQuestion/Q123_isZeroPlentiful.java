package AllQuestion;

public class Q123_isZeroPlentiful {
    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
        System.out.println(isZeroPlentiful(new int[]{}));
    }

    static int isZeroPlentiful(int[] a) {
        if(a.length<4) {
            return 0;
        }

        int countZeroSequence = 0;
        int count = 0;
        for(int i=0; i<a.length-3; i++) {
            if(a[i] == 0 && a[i+1] == 0 && a[i+2] == 0 && a[i+3] == 0) {
                countZeroSequence++;
                i = i+3;
                while(i < a.length-3) {
                    if(a[i] == 0 && a[i+1] == 0){
                        i++;
                    } else {
                        break;
                    }
                }
                continue;
            }
            if(a[i] == 0 && a[i+1] == 0) {
                count++;
            } else if(a[i] == 0 && a[i+1] != 0) {
                if(count >= 4) {
                    countZeroSequence++;
                } else {
                    return 0;
                }
            }

        }
        return countZeroSequence;
    }
}

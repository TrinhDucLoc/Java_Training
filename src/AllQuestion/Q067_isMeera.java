package AllQuestion;

public class Q067_isMeera {
    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{3,5,-2}));
        System.out.println(isMeera(new int[]{8,3,4}));
    }

    static int isMeera(int[] a) {
        int[] doubleArray = new int[a.length];

        for(int i=0; i<a.length; i++) {
            doubleArray[i] = a[i]*2;
        }

        for(int i=0; i<doubleArray.length; i++) {
            for(int j=0; j<a.length; j++) {
                if(doubleArray[i] == a[j]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}

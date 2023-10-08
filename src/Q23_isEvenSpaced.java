public class Q23_isEvenSpaced {
    public static void main(String[] args) {
        System.out.println(isEvenSpaced(new int[]{100, 19, 131, 140}));
        System.out.println(isEvenSpaced(new int[]{200, 1, 51, 160}));
        System.out.println(isEvenSpaced(new int[]{200, 10, 151, 160}));
        System.out.println(isEvenSpaced(new int[]{100, 19, -131, -140}));
        System.out.println(isEvenSpaced(new int[]{80, -56, 11, -81}));
    }

    static int isEvenSpaced(int[] a){
//        validate
        if(a.length < 2) {
            return 0;
        }

        int maxArray = a[0];
        int minArray = a[0];

        for(int i=0; i<a.length; i++) {
            if(a[i] > maxArray){
                maxArray = a[i];
            } else if(a[i] < minArray) {
                minArray = a[i];
            }
        }
        if((maxArray - minArray) % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

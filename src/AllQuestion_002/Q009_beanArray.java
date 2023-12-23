package AllQuestion_002;

public class Q009_beanArray {
    public static void main(String[] args) {
        System.out.println(isBean1(new int[]{1, 2, 3, 9, 6, 13}));
        System.out.println(isBean1(new int[]{3, 4, 6, 7, 13, 15}));
        System.out.println(isBean1(new int[]{1, 2, 3, 4, 10, 11, 12}));
        System.out.println(isBean1(new int[]{3, 6, 9, 5, 7, 13, 6, 17}));

        System.out.println();
        System.out.println(isBean2(new int[] {2, 10, 9, 3}));
        System.out.println(isBean2(new int[] {0, -1, 1}));
        System.out.println(isBean2(new int[] {3, 4, 5, 7}));

        System.out.println();
        System.out.println(isBean3(new int[]{4,9,8}));
        System.out.println(isBean3(new int[]{3,8,4}));

        System.out.println();
        System.out.println(isBeanArray(new int[]{21, 3, 7, 9, 11, 4, 6} ));
        System.out.println(isBeanArray(new int[]{13, 4, 4,4, 4}));
        System.out.println(isBeanArray(new int[]{8, 5,-5, 5, 3}));
    }

    public static int isBean1(int[] a) {
//        a. { 9, 6, 18} (contains a 9 but no 13)
//   b. {4, 7, 16} (contains both a 7 and a 16)
        int flag9 = 0, flag13 = 0, flag7 = 0, flag16 = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == 9) {
                flag9 = 1;
            }
            if(a[i] == 13) {
                flag13 = 1;
            }
            if(a[i] == 7) {
                flag7 = 1;
            }
            if(a[i] == 16) {
                flag16 = 1;
            }
        }
        if(flag9 == 1 && flag13 == 1) {
            return 1;
        }
        if(flag7 == 1 && flag16 == 0) {
            return 1;
        }
        return 0;
    }

    public static int isBean2(int[] a) {
        for(int i=0; i<a.length; i++) {
            int flag = 0;
            for(int j=0; j<a.length; j++) {
                if((a[i] == a[j]-1) || (a[i] == a[j]+1)) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int isBean3(int[] a) {
        for(int i=0; i<a.length; i++) {
            int flag = 0;
            for(int j=0; j<a.length; j++) {
                if(a[i] == 2*a[j] || a[i] == 2*a[j]+1 || a[i] == a[j]/2) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int isPrime(int n) {
        if(n <= 1) {
            return 0;
        }
        for(int i=2; i<= (int) Math.sqrt(n); i++) {
            if(n%i==0) {
                return 0;
            }
        }
        return 1;
    }

    public static int isBeanArray(int[] a) {
        int sumPrime = 0;

        for(int i=0; i<a.length; i++) {
            if(isPrime(a[i]) == 1) {
                sumPrime += a[i];
            }
        }

        if(sumPrime == a[0]) {
            return 1;
        } else {
            return 0;
        }
    }
}

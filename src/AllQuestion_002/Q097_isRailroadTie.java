package AllQuestion_002;

public class Q097_isRailroadTie {
    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{0, 1, 2, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1}));
        System.out.println(isRailroadTie(new int[]{}));
        System.out.println(isRailroadTie(new int[]{0}));
        System.out.println();
        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
    }

    public static int isRailroadTie(int[] a) {
        int flagNonZero = 0;

        if(a.length < 2) {
            return 0;
        }

        if(a.length >= 2) {
            if(a[0] == 0 || a[a.length-1] == 0) {
                return 0;
            }
            if((a[0] != 0 && a[1] == 0) || (a[a.length-1] != 0 && a[a.length-2] == 0)) {
                return 0;
            }

            if(a.length == 2 && a[0] != 0 && a[1] != 0) {
                return 1;
            }
        }

        for(int i=1; i<a.length-1; i++) {
            if(a[i] != 0) {
                flagNonZero = 1;
            }

            if((a[i] != 0 && a[i-1] == 0 && a[i+1] == 0) || (a[i] != 0 && a[i-1] != 0 && a[i+1] != 0)) {
                return 0;
            }

            if(a[i] == 0 && a[i+1] == 0) {
                return 0;
            }
        }

        if(flagNonZero == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    static int isRailroadTie1(int[] a) {

        int flagOneNonZero = 0;
        for(int i=0; i<a.length; i++) {
            //a. The array contains at least one non-zero element
            if(a[i] != 0) {
                flagOneNonZero = 1;
            }
            //b. Every non-zero element has exactly one non-zero neighbor
            if((a[0] != 0 && a[1] == 0) || (a[a.length-1] != 0 && a[a.length-2] == 0)) {
                return 0;
            }
            if(i >= 1 && i <= a.length-2) {
                if((a[i] != 0 && a[i-1] == 0 && a[i+1] == 0) || (a[i] !=0 && a[i+1] !=0 && a[i-1] != 0)) {
                    return 0;
                }
            }
            //c. Every zero element has two non-zero neighbors.
            if(a[0] == 0 || a[a.length-1] == 0) {
                return 0;
            }
            if(i >= 1 && i <= a.length-2) {
                if((a[i] == 0 && a[i+1] == 0) || (a[i] == 0 && a[i-1] == 0)) {
                    return 0;
                }
            }
        }
        if(flagOneNonZero == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    static int isRailroadTie2(int[] a) {
        if((a[0] != 0 && a[1] == 0) || (a[a.length-1] != 0 && a[a.length-2] == 0)
                || a[0] == 0 || a[a.length-1] == 0) {
            return 0;
        }
        int flagOneNonZero = 0;
        for(int i=0; i<a.length; i++) {
            //a. The array contains at least one non-zero element
            if(a[i] != 0) {
                flagOneNonZero = 1;
            }
            if(i >= 1 && i <= a.length-2) {
                //b. Every non-zero element has exactly one non-zero neighbor
                if((a[i] != 0 && a[i-1] == 0 && a[i+1] == 0) || (a[i] !=0 && a[i+1] !=0) && a[i-1] != 0) {
                    return 0;
                }
                //c. Every zero element has two non-zero neighbors.
                if((a[i] == 0 && a[i+1] == 0) || (a[i] == 0 && a[i-1] == 0)) {
                    return 0;
                }
            }
        }
        if(flagOneNonZero == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

package AllQuestion;

public class Q097_isRailroadTie {
    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2} ));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3} ));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
    }

    static int isRailroadTie(int[] a) {

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

    static int isRailroadTie1(int[] a) {
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


//a. The array contains at least one non-zero element
//b. Every non-zero element has exactly one non-zero neighbor
//c. Every zero element has two non-zero neighbors.

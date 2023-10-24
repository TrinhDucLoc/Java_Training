package AllQuestion;

public class Q083_isOddValent {
    public static void main(String[] args) {
        System.out.println(isOddValent(new int[]{9, 3, 4, 9, 1}));
        System.out.println(isOddValent(new int[]{3, 3, 3, 3}));
        System.out.println(isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2}));
        System.out.println(isOddValent(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isOddValent(new int[]{2, 2, 2, 4, 4}));
    }

//    Way 1:
    static int isOddValent(int[] a) {
        int flagDuplicate = 0;
        int flagOddValue = 0;
        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] > a[j]) {
                    int tempValue = a[i];
                    a[i] = a[j];
                    a[j] = tempValue;
                }
            }
        }

        for(int i=0; i<a.length; i++) {
            if(i<a.length-1) {
                if(a[i] == a[i+1]) {
                    flagDuplicate = 1;
                } else if(a[i] % 2 != 0) {
                    flagOddValue = 1;
                }
            } else {
                if(a[i] % 2 != 0) {
                    flagOddValue = 1;
                }
            }
        }

        if(flagOddValue == 1 && flagDuplicate == 1) {
            return 1;
        } else {
            return 0;
        }
    }

//    Way 2:
    static int isOddValent1(int[] a) {
        int flagOddValue = 0;
        int flagDuplicate = 0;

        for(int i=0; i<a.length-1; i++) {
            if(a[i] % 2 != 0) {
                flagOddValue = 1;
            }
            if(flagDuplicate == 0){
                for(int j=i+1; j<a.length; j++) {
                    if(a[i] == a[j]){
                        flagDuplicate = 1;
                        break;
                    }
                }
            }
        }
        if(flagDuplicate == 1 && flagOddValue == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

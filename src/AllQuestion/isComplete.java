package AllQuestion;

public class isComplete {
    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{36, -28}));
        System.out.println(isComplete(new int[]{36, 28}));
        System.out.println(isComplete(new int[]{4}));
        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));
    }

    static int isComplete(int[] a) {
        int flagEvenElement = 0;
        int flagPerfectSquare = 0;
        int flagSumElement8 = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0 && flagEvenElement == 0) {
                flagEvenElement = 1;
            }
            if(perfectSquare(a[i]) == 1 && flagPerfectSquare == 0) {
                flagPerfectSquare = 1;
            }
            if(flagEvenElement == 1 && flagPerfectSquare == 1){
                break;
            }
        }

        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] + a[j] == 8) {
                    flagSumElement8 = 1;
                }
            }
        }

        if(flagEvenElement == 1 && flagPerfectSquare == 1 && flagSumElement8 == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    static int perfectSquare(int num) {
        for(int i=1; i<=num/2; i++) {
            if(i*i == num) {
                return 1;
            }
        }
        return 0;
    }
}

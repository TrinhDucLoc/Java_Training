package Recode_001;

public class Q18_countSquarePairs {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{9}));
    }

    static int countSquarePairs(int[] a) {
//        validate
//        x,y > 0; x,y != 0; x < y and x + y perfect square
        if(a.length < 2) {
            return  0;
        }
//        solution
        int count = 0;
        for(int i=0; i<a.length - 1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] <= 0) {
                    break;
                }
                if(a[j] <= 0) {
                    continue;
                }
                if(isPerfectSquare(a[i] + a[j]) == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    static int isPerfectSquare(int num) {
        for(int i=1; i<=num/2; i++) {
            if(i*i == num) {
                return 1;
            }
        }
        return 0;
    }
}

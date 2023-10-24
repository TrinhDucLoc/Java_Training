package AllQuestion;

public class Q081_oddEvenSum {
    public static void main(String[] args) {
        System.out.println(oddEvenSum(new int[]{1}));
        System.out.println(oddEvenSum(new int[]{1,2}));
        System.out.println(oddEvenSum(new int[]{1,2,3}));
        System.out.println(oddEvenSum(new int[]{1,2,3,4}));
        System.out.println(oddEvenSum(new int[]{3,3,4,4}));
        System.out.println(oddEvenSum(new int[]{}));
    }

    static int oddEvenSum(int[] a){
        if(a.length == 0) {
            return 0;
        }

        int oddSum = 0;
        int evenSum = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0) {
                evenSum += a[i];
            } else {
                oddSum += a[i];
            }
        }
        return oddSum - evenSum;
    }

}

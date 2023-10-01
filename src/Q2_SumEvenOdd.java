public class Q2_SumEvenOdd {
    public static void main(String[] args) {
        System.out.println(SumEvenOdd(new int[]{1}));
        System.out.println(SumEvenOdd(new int[]{1,2}));
        System.out.println(SumEvenOdd(new int[]{1,2,3}));
        System.out.println(SumEvenOdd(new int[]{1,2,3,4}));
        System.out.println(SumEvenOdd(new int[]{3,3,4,4,}));
        System.out.println(SumEvenOdd(new int[]{}));
    }

    public static int SumEvenOdd(int[] a) {
        if(a.length == 0) {
            return 0;
        }

        int X = 0;
        int Y = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] % 2 == 0){
                Y += a[i];
            } else {
                X += a[i];
            }

        }
        return X - Y;
    }
}

//Solution:
// loop for array
// if(arr[i] % 2 == 0) => Y += arr[i] else X += arr[i]
// return X - Y

package AllQuestion;

public class Q015_isCentered15 {
    public static void main(String[] args) {
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9} ));
        System.out.println(isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(isCentered15(new int[]{1,1,8, 3, 1, 1}));
        System.out.println(isCentered15(new int[]{9, 15, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1} ));
        System.out.println(isCentered15(new int[]{1, 1, 15 -1,-1}));
    }

    static int isCentered15(int[] a) {
        int sumValue = 0;

        for(int l=0, r=a.length-1; l<=r; l++, r--) {
            for(int k=l; k<=r; k++) {
                sumValue += a[k];
            }
            if(sumValue == 15){
                return 1;
            } else {
                sumValue = 0;
            }
        }
        return 0;
    }
}


// Requirement:
// centered-15 if some consecutive sequence of elements of the array sum to 15
// and this sequence is preceded and followed by the same number of elements

// Testcase:
// Input: {3, 2, 10, 4, 1, 6, 9}, Output: 1
// Input: {2, 10, 4, 1, 6, 9}, Output: 0
// Input: {1,1,8, 3, 1, 1} , Output: 0

// Solution:
// Problem Type: Two pointer
// sumMidleValue = Sum total of midle value => If sumMiddleValue == 15 => Return 1
// Else l++, r-- => sumMidleValue => Continue compare with 15 => Continue loop to l <= r => Return 0;

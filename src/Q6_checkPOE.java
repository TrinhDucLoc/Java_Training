public class Q6_checkPOE {
    public static void main(String[] args) {
        System.out.println(checkPOE(new int[]{1,8,3,7,10,2}));
        System.out.println(checkPOE(new int[]{1,5,3,1,1,1,1,1,1}));
        System.out.println(checkPOE(new int[]{2,1,1,1,2,1,7}));
        System.out.println(checkPOE(new int[]{1,2,3}));
        System.out.println(checkPOE(new int[]{3,4,5,10}));
        System.out.println(checkPOE(new int[]{1,2,10,3,4}));
    }

    public static int checkPOE(int[] array){
        if(array.length < 3) {
            return -1;
        }
        int left = 0, right = array.length - 1, idx = 0;
        int sumLeft = array[left];
        int sumRight = array[right];

        for(int i=1; i<array.length - 2; i++) {
            if(sumLeft > sumRight) {
                right--;
                sumRight += array[right];
                idx = right - 1;
            } else {
                left++;
                sumLeft += array[left];
                idx = left + 1;
            }
        }

        if(sumLeft == sumRight) {
            return idx;
        } else {
            return -1;
        }
    }
}

// Solution:
// validate: if array.length < 3 => no POE
// Using two pointer for this problem
// int l=0; int r=array.length - 1;
// int sumLeft = array[0]
// int sumRight = array[array.length - 1]
// int idx = 0;
// for(int i=0; i<array.length; i++)
// if(sumLeft > sumRight) => j--, idx = j--, sumRight += array[j]
// else => i++, idx = i++, sumLeft += array[i]
// if(sumLeft == sumRight) => return idx else return -1;

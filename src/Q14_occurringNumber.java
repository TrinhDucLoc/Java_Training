public class Q14_occurringNumber {
    public static void main(String[] args) {
        System.out.println(occurringNumber(new int[]{6,8,1,8,2}));
        System.out.println(occurringNumber(new int[]{6,8,1,8,6}));
        System.out.println(occurringNumber(new int[]{1,1,1,2,2,3}));
        System.out.println(occurringNumber(new int[]{1}));
    }

    public static int occurringNumber(int[] array) {
//        validate
        if(array.length == 1) {
            return array[0];
        }

        int lengthNewArray = array.length;
//        get length for arrayNotDuplicate
        for(int i=0; i<array.length - 1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] == array[j]) {
                    lengthNewArray--;
                    break;
                }
            }
        }

//        System.out.println(lengthNewArray);

//        get item for arrayNotDuplicate
        int[] arrayNotDuplicate = new int[lengthNewArray];
        int k = 0;

        for(int i=0; i<array.length - 1; i++) {
            int isDuplicate = 0;
            for(int j=i+1; j<array.length; j++) {
                if(array[i] == array[j]) {
                    isDuplicate = 1;
                    break;
                }
            }
            if(isDuplicate == 0) {
                arrayNotDuplicate[k] = array[i];
                k++;
            }
        }

        arrayNotDuplicate[lengthNewArray - 1] = array[array.length - 1];

//        System.out.println(arrayNotDuplicate);

//        Compare arrayNotDuplicate vs array
        int temp = 0;
        int mostDuplicateNum = 0;
        for(int i=0; i<lengthNewArray; i++) {
            int cnt = 0;
            for(int j=0; j<array.length; j++) {
                if(arrayNotDuplicate[i] == array[j]) {
                    cnt++;
                }
            }
            if(cnt > temp) {
                temp = cnt;
                mostDuplicateNum = arrayNotDuplicate[i];
            }
        }

        return mostDuplicateNum;
    }
}

// Solution:
// from array get arrayNotDuplicate
// campare arrayNotDuplicate with array
// if(arrayNotDuplicate[i] == array[j]) => cnt++
// if(cnt > temp) => temp = cnt, mostOccurringNum = arrayNotDuplicate[i]
// return mostOccurringNum

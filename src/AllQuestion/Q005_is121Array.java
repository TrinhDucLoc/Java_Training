package AllQuestion;

public class Q005_is121Array {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }

    static int is121Array(int[] a) {
        int countOne = 1;
        int countOneTemp = 1;
        int flagTwo = 0;
        int flagOne = 0;

//        validate
        if(a[0] != 1) {
            return 0;
        }

        if(a[a.length - 1] != 1) {
            return 0;
        }

        for(int i=0; i<a.length - 1; i++) {
            if(a[i] != 1 && a[i] != 2){
                return 0;
            }

            if(a[i] == 1 && a[i+1] == 1 && flagOne == 0) {
                countOne++;
            } else if(a[i] == 1 && a[i+1] != 1) {
                flagOne = 1;
            }

            if(a[i] == 2 && flagTwo == 1) {
                return 0;
            }

            if(a[i] == 2 && a[i+1] == 2 && flagTwo == 0) {
                flagTwo = 0;
            } else if(a[i] == 2 && a[i+1] == 1 && flagTwo == 0) {
                flagTwo = 1;
            }

            if(a[i] == 1 && a[i+1] == 1 && flagOne == 1) {
                countOneTemp++;
            }
        }

        if(countOne == countOneTemp && flagTwo == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

// Requirement:
// all its elements are either 1 or 2
// it begins with one or more 1s followed by a one or more 2s and then ends with the same number of 1s that it begins with

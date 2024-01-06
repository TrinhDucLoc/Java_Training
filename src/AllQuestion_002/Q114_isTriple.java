package AllQuestion_002;

public class Q114_isTriple {
    public static void main(String[] args) {
        System.out.println(isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println(isTriple(new int[]{2, 5, 2, 5, 5, 2, 5}));
        System.out.println(isTriple(new int[]{3, 1, 1, 1}));
    }

    public static int isTriple(int[] a) {
        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] > a[j]) {
                    int tempValue = a[i];
                    a[i] = a[j];
                    a[j] = tempValue;
                }
            }
        }

        int count = 1;
        for(int i=0; i<a.length; i++) {
            if(i < a.length-1 && a[i] == a[i+1]) {
                count++;
            } else if(i < a.length-1 && a[i] != a[i+1]) {
                if(count != 3) {
                    return 0;
                }

                count = 1;
            }

            if(i == a.length - 1 && count != 3) {
                return 0;
            }
        }

        return 1;
    }
}

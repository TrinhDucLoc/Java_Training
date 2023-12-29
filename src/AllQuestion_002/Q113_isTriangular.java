package AllQuestion_002;

public class Q113_isTriangular {
    public static void main(String[] args) {
        System.out.println(isTriangular(1));
        System.out.println(isTriangular(3));
        System.out.println(isTriangular(4));
        System.out.println(isTriangular(6));
        System.out.println(isTriangular(10));
        System.out.println(isTriangular(11));
        System.out.println(isTriangular(12));
        System.out.println(isTriangular(13));
        System.out.println(isTriangular(14));
        System.out.println(isTriangular(15));
    }

    public static int isTriangular(int n) {
        if(n <= 0) {
            return 0;
        }
        int currentNum = 0;
        int index = 1;

        while(currentNum < n) {
            currentNum += index;
            index++;
        }

        if(currentNum == n) {
            return 1;
        } else {
            return 0;
        }
    }
}

package AllQuestion;

public class Q057_isSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }

//    Way 1:
//    static int isSquare(int n) {
//        if(n < 0) {
//            return 0;
//        }
//
//        if(n == 0) {
//            return 1;
//        }
//
//        for(int i=1; i<=n; i++) {
//            if(i*i == n) {
//                return 1;
//            }
//        }
//        return 0;
//    }

//    Way 2:
    static int isSquare(int n) {
        if(n < 0) {
            return 0;
        }
        int squareNumber = 0;
        int i = 1;
        while(squareNumber < n) {
            squareNumber = i*i;
            i++;
        }
        if(squareNumber == n) {
            return 1;
        } else {
            return 0;
        }
    }
}

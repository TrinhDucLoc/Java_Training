package AllQuestion;

public class Q051_isGuthrie {
    public static void main(String[] args) {
        System.out.println(isGuthrie(11));
        System.out.println(isGuthrie(22));
        System.out.println(isGuthrie(8));
    }

//    Way 1:
//    static int isGuthrie(int n) {
//        int tempNum = 1;
//        for(int i=0; i<=n; i++) {
//            tempNum += i;
//            if(tempNum == n) {
//                return 1;
//            }
//            if(tempNum > n) {
//                break;
//            }
//        }
//        return 0;
//    }

// Way 2:
    static int isGuthrie(int n) {
        int tempNum = 1;
        int i=0;
        while(tempNum < n) {
            tempNum += i;
            i++;
        }
        if(tempNum == n) {
            return 1;
        } else {
            return 0;
        }
    }
}

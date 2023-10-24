package AllQuestion;

public class Q080_isNormal {
    public static void main(String[] args) {
        System.out.println(isNormal(1));
        System.out.println(isNormal(2));
        System.out.println(isNormal(3));
        System.out.println(isNormal(4));
        System.out.println(isNormal(5));
        System.out.println(isNormal(6));
        System.out.println(isNormal(7));
        System.out.println(isNormal(8));
        System.out.println(isNormal(9));
        System.out.println(isNormal(10));
    }

    static int isNormal(int n) {
//        validate: except for 1 and possibly itself
//        solution:
        for(int i=2; i<n; i++){
//            this is factor
            if(n%i==0 && i % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}

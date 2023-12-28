package AllQuestion_002;

public class Q079_isNormal {
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

    public static int isNormal(int n) {
        for(int i=2; i<= n-1; i++) {
            if(n % i == 0 && i % 2 != 0) {
                return 0;
            }
        }

        return 1;
    }
}

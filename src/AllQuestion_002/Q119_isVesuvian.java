package AllQuestion_002;

public class Q119_isVesuvian {
    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
    }

    public static int isVesuvian(int n) {
        int count = 0;

        for(int i=1; i<= n/2; i++) {
            if(isSquare(i) == 1 && isSquare(n-i) == 1) {
                count++;
            }
        }

        if(count >= 2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int isSquare(int n) {
        for(int i=0; i <= n; i++) {
            if(i*i == n){
                return 1;
            }
        }

        return 0;
    }
}

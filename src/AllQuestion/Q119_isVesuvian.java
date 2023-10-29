package AllQuestion;

public class Q119_isVesuvian {
    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
    }

    static int isVesuvian(int n) {
        int count = 0;
        for(int i=1; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(isSquare(i+j) == 1) {
                    count++;
                }
            }
        }
        if(count >= 2) {
            return 1;
        } else {
            return 0;
        }
    }

    static int isSquare(int n) {

        for(int i=0; i<=n; i++) {
            if(i*i == n) {
                return 1;
            }
        }
        return 0;
    }
}

package AllQuestion;

public class Q105_isSmart {
    public static void main(String[] args) {
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(8));
    }

    static int isSmart(int n) {
        int smartNum = 1;
        for(int i=0; i<=n; i++) {
            smartNum += i;
            if(smartNum == n) {
                return 1;
            }
        }
        return 0;
    }
}

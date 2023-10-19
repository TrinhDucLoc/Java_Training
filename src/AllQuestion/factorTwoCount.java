package AllQuestion;

public class factorTwoCount {
    public static void main(String[] args) {
        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
    }

    static int factorTwoCount(int n) {
        if(n % 2 != 0) {
            return 0;
        }
        int tempN = n;
        int count = 0;
        while(tempN % 2 == 0) {
            tempN /= 2;
            count++;
        }
        return count;
    }
}

package AllQuestion;

public class countDigit {
    public static void main(String[] args) {
        System.out.println(countDigit(32121, 1));
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
    }

    static int countDigit(int n, int digit) {
        int tempNum = n;
        int count = 0;

        while(tempNum > 0) {
            int lastDigit = tempNum % 10;
            if(lastDigit == digit) {
                count++;
            }
            tempNum /=10;
        }
        return count;
    }
}

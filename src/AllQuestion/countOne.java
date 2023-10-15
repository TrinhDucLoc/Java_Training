package AllQuestion;

public class countOne {
    public static void main(String[] args) {
        System.out.println(countOne(5));
        System.out.println(countOne(15));
    }

    static int countOne(int n) {
        int count = 0;

        while(n > 0) {
            int digit = n % 2;
            if(digit == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }
}

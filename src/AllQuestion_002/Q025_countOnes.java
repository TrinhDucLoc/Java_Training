package AllQuestion_002;

public class Q025_countOnes {
    public static void main(String[] args) {
        System.out.println(countOnes(9));
        System.out.println(countOnes(5));
        System.out.println(countOnes(15));
    }

    public static int countOnes(int n) {
        int countOne = 0;

        while(n > 0) {
            int binaryNum = n % 2;
            n /= 2;
            if(binaryNum == 1) {
                countOne++;
            }
        }

        return countOne;
    }
}

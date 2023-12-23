package AllQuestion_002;

public class Q041_factorTwoCount {
    public static void main(String[] args) {
        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
    }

    public static int factorTwoCount(int n) {
        int countFactor = 0;

        while(n % 2 == 0) {
            countFactor++;
            n /= 2;
        }

        return countFactor;
    }
}

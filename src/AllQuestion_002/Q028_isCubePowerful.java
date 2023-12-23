package AllQuestion_002;

public class Q028_isCubePowerful {
    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }

    public static int isCubePowerful(int n) {
        if(n <= 0) {
            return 0;
        }

        int sumValue = 0;
        int tempN = n;

        while(tempN > 0) {
            int lastDigit = tempN % 10;
            tempN /= 10;
            sumValue += lastDigit*lastDigit*lastDigit;
        }
        if(sumValue == n) {
            return 1;
        } else {
            return 0;
        }
    }
}

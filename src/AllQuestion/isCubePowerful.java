package AllQuestion;

public class isCubePowerful {
    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }

    static int isCubePowerful(int n) {
//        validate
        if(n <= 0) {
            return 0;
        }

        int tempNum = n;
        int sumValue = 0;
        while(tempNum > 0) {
            int lastDigit = tempNum % 10;
            sumValue = sumValue + lastDigit*lastDigit*lastDigit;
            tempNum /= 10;
        }
        if(sumValue == n){
            return 1;
        } else {
            return 0;
        }
    }
}

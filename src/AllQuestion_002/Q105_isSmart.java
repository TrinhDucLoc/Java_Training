package AllQuestion_002;

public class Q105_isSmart {
    public static void main(String[] args) {
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(8));
    }

    public static int isSmart(int n) {
        int k = 2;
        int previousValue = 1;
        int currentValue = previousValue + k - 1;
        if(n == 1) {
            return 1;
        }

        while(currentValue < n) {
            k++;
            previousValue = currentValue;
            currentValue = previousValue + k - 1;
        }

        if(currentValue == n) {
            return 1;
        } else {
            return 0;
        }
    }
}

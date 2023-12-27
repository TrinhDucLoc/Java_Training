package AllQuestion_002;

public class Q071_minDistance {
    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }

    public static int minDistance(int n) {
        int minValue = Integer.MAX_VALUE;
        int previousFactor = 1;
        for(int i=2; i<=n; i++) {
            if(n%i == 0) {
                if(minValue > (i - previousFactor)) {
                    minValue = i - previousFactor;
                }
                previousFactor = i;
            }
        }
        return minValue;
    }
}

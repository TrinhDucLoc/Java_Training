package AllQuestion;

public class Q071_minDistance {
    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }

    static int minDistance(int n) {
        int previousFactor = 1;
        int minDistanceValue = Integer.MAX_VALUE;

        for(int i=2; i<=n; i++) {
            if(n%i==0) {
                if(i-previousFactor < minDistanceValue) {
                    minDistanceValue = i - previousFactor;
                }
                previousFactor = i;
            }
        }
        return minDistanceValue;
    }
}

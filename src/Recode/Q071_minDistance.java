package Recode;

public class Q071_minDistance {
    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }

    static int minDistance(int n) {
        int distance = Integer.MAX_VALUE;
        int previousFactor = 1;
        int currentFactor = 0;
        for(int i=2; i<=n; i++) {
            if(n%i == 0) {
                currentFactor = i;
                if(currentFactor - previousFactor < distance) {
                    distance = currentFactor - previousFactor;
                }
                previousFactor = currentFactor;
            }
        }
        return distance;
    }

    static int minDistance1(int n) {
        int minValue = Integer.MAX_VALUE;
        int previousFactor = 1;
        int currentFactor = 0;

        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                currentFactor = i;
                if(currentFactor - previousFactor < minValue) {
                    minValue = currentFactor - previousFactor;
                }
                previousFactor = currentFactor;
            }
        }

        return minValue;
    }
}

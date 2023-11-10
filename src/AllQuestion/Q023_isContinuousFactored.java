package AllQuestion;

public class Q023_isContinuousFactored {
    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(121));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));
    }

    static int isContinuousFactored(int n) {
        int productValue = 1;
        for(int i=2; i<n; i++) {
            if(n%i==0){
                productValue *= i;
                int j = i;
                while(productValue < n) {
                    j++;
                    if(n%j==0) {
                        productValue *= j;
                    } else {
                        productValue = 1;
                        break;
                    }
                }
                if(productValue == n) {
                    return 1;
                }
                productValue = 1;
            }
        }
        return 0;
    }
}

// Requirement:
// An integer is defined to be “continuous factored”
// if it can be expressed as the product of two or more continuous integers greater than 1.

// Solution:
// Check factor greater than 1
// Declare productValue
// Loop i from 2 to n-1
// check i is factor and productValue *= i
// productValue *= i
// declare j=i
// while(productValue < n) => check j+1 value is factor => productValue *= j => check productValue == n => return 1


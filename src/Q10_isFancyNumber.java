public class Q10_isFancyNumber {
    public static void main(String[] args) {
        System.out.println(isFancyNumber(17));
        System.out.println(isFancyNumber(0));
        System.out.println(isFancyNumber(-1));
        System.out.println(isFancyNumber(1));
        System.out.println(isFancyNumber(60));
        System.out.println(isFancyNumber(61));
    }

    public static int isFancyNumber(int num) {
//        validate
        if(num <= 0) {
            return 0;
        }
        if(num == 1) {
            return 1;
        }
        int prev = 1, pprev = 1, cur = 0;
        for(int i=1; i<num; i++) {
            cur = prev * 3 + pprev * 2;
            if(cur == num) {
                return 1;
            } else {
                pprev = prev;
                prev = cur;
            }
        }
        return 0;
    }
}


// Solution
// Validate: if(num <= 0) return 0
// Validate: if(num == 1) return 1
// prev = 1, pprev = 1, cur = prev * 3 + pprev * 2


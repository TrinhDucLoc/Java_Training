public class Q18_countSquarePairs {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{9,0,2,-5,7}));
        System.out.println(countSquarePairs(new int[]{9,1}));
        System.out.println(countSquarePairs(new int[]{9}));
    }

    public static int countSquarePairs(int[] a) {
        if(a.length < 2) {
            return 0;
        }

        int cnt = 0;
        for(int i=0; i<a.length - 1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] <= 0) {
                    break;
                }
                if(a[j] <= 0) {
                    continue;
                }
                if(isPerfectSquare(a[i] + a[j]) == 1) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int isPerfectSquare(int n){
        for(int i=0; i<n/2; i++) {
            if(i*i == n) {
                return 1;
            }
        }
        return 0;
    }
}

/*
a square pair <x,y>
+ x,y > 0,
+ x,y # 0
+ x < y
+ x + y = perfect square




 */

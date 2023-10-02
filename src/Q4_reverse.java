public class Q4_reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(12005));
        System.out.println(reverse(1));
        System.out.println(reverse(-1233));
        System.out.println(reverse(0));
    }

//    public static int reverse(int n){
//        int flag = 1;
//        int reverse = 0;
//        if(n == 0) {
//            return 0;
//        }
//        if(n < 0) {
//            flag = -1;
//            n = -n;
//        }
//        while(n != 0) {
////            last digit
//            int lastDigit = n % 10;
////            reverse add last digit
//            reverse = reverse * 10 + lastDigit;
////            num remove last digit
//            n /= 10;
//        }
//
//        return flag*reverse;
//    }

//    code 2
    public static int reverse(int n) {
        int flag = 1;
        if(n == 0) {
            return 0;
        }
        if(n < 0) {
            flag = -1;
            n = -n;
        }
        int rerveseNum = 0;
        while(n != 0) {
            int digit = n % 10;
            rerveseNum = rerveseNum*10 + digit;
            n /= 10;
        }
        return flag*rerveseNum;
    }
}


// Solution
// int reverse(int n)
// if(n = 0) => return 0;
// if(n < 0)
// => flag = -1
// => n = -n
// if(n > 0)
// while(n != 0)
// int digit = n % 10;
// reverse = n*10 + digit;
// n = n/10;

package AllQuestion;

public class findSmallestBEQnumber {
    public static void main(String[] args) {
        System.out.println(findSmallestBEQNumber());
    }

    static int findSmallestBEQNumber() {
        int num = 1;
        int BEQNum;
        while(true) {
            BEQNum = num*num*num;
            int countSix = 0;
            while(BEQNum > 0) {
                int lastDigit = BEQNum % 10;
                if(lastDigit == 6) {
                    countSix++;
                }
                BEQNum /= 10;
            }
            if(countSix == 4) {
                return num;
            }
            num++;
        }
    }
}

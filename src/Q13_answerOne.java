public class Q13_answerOne {
    public static void main(String[] args) {
        System.out.println(answerOne(50));
        System.out.println(answerOne(4));
        System.out.println(answerOne(0));
    }

    public static int answerOne(int n) {
        int cnt = 0;
        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                if(n == i*i + j*j) {
                    cnt++;
                }
            }
        }
        if(cnt >= 2) {
            return 1;
        } else {
            return 0;
        }
    }
}

// solution
// Math: num = i*i + j*j with two ways

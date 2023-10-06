public class Q19_findPorcupineNumber {
    public static void main(String[] args){
        System.out.println(findPorcupineNumber(137));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));
        System.out.println(findPorcupineNumber(7));
        System.out.println(findPorcupineNumber(1));
    }

    public static int findPorcupineNumber(int number) {
        int porcupineNumber = 0;
        int maxValueInt = Integer.MAX_VALUE;
        boolean isPorcupineNumber = false;
        int iPrime = number + 1;

        while (iPrime <= maxValueInt) {
//            Condition of porcupine 1: isPrime(num) == 1 && num % 10 = 9
            if(isPrime(iPrime) == 1 && isPorcupineNumber == false) {
                if(iPrime % 10 == 9) {
                    porcupineNumber = iPrime;
                    isPorcupineNumber = true;
                }
            } else
//            Condition of porcupine 2: nextPrime % 10 = 9
            {
                if(isPrime(iPrime) == 1 && isPorcupineNumber == true) {
                    if (iPrime % 10 == 9) {
                        break;
                    } else {
                        isPorcupineNumber = false;
                    }
                }
            }
            iPrime++;
        }
        return porcupineNumber;
    }

    public static int isPrime(int num) {
        if(num > 1) {
            for(int i=2; i<=num/2; i++) {
                if(num%i == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}

/*
1–20	2	3	5	7	11	13	17	19	23	29	31	37	41	43	47	53	59	61	67	71
21–40	73	79	83	89	97	101	103	107	109	113	127	131	137	139	149	151	157	163	167	173
41–60	179	181	191	193	197	199	211	223	227	229	233	239	241	251	257	263	269	271	277	281
 */

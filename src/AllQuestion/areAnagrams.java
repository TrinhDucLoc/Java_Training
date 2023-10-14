package AllQuestion;

public class areAnagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }

    static int areAnagrams(char[] a1, char[] a2) {
//        validate
        if(a1.length == 0 && a2.length == 0) {
            return 1;
        }

        if(a1.length != a2.length) {
            return 0;
        }

//        solution
        for(int i=0; i<a1.length-1; i++) {
            for(int j=i+1; j<a1.length; j++) {
                if(a1[i] > a1[j]){
                    char temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
                if(a2[i] > a2[j]) {
                    char temp = a2[i];
                    a2[i] = a2[j];
                    a2[j] = temp;
                }
            }
        }

        for(int i=0; i<a1.length; i++) {
            if(a1[i] != a2[i]){
                return 0;
            }
        }

        return 1;
    }
}

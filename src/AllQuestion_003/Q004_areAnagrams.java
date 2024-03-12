package AllQuestion_003;

public class Q004_areAnagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }

    public static int areAnagrams(char[] a1, char[] a2) {
        //validation
        if(a1.length != a2.length) {
            return 0;
        }

        //solution
        int totalLetterAlphabet = 26;
        int[] alphabet = new int[totalLetterAlphabet];

        for(int i=0; i< a1.length; i++) {
            alphabet[a1[i] - 'a']--;
            alphabet[a2[i] - 'a']++;
        }

        for(int i=0; i<alphabet.length; i++) {
            if(alphabet[i] != 0) {
                return 0;
            }
        }
        return 1;
    }
}

import java.util.Scanner;

public class Valid_Anagram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] anpha = new int[36];

        for(int i = 0; i<s.length(); i++){
            anpha[s.charAt(i) - 'a']++;
            anpha[t.charAt(i) - 'a']--;
        }

        for(int i : anpha){
            if(i != 0){
                return false;
            }
        }

        return true;
    }
}

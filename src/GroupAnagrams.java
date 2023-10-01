import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        class Solution {
            public List<List<String>> groupAnagrams(String[] strs) {
                if(strs == null || strs.length == 0) {
                    return Collections.emptyList();
                }
                Map<String, List<String>> hashMap = new HashMap<>();

                for(String word : strs ) {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    String sortedWord = String.valueOf(chars);
                    if(!hashMap.containsKey(sortedWord)){
                        hashMap.put(sortedWord, new ArrayList<>());
                    }
                    hashMap.get(sortedWord).add(word);
                }
                return new ArrayList<>(hashMap.values());
            }
        }

    }
}

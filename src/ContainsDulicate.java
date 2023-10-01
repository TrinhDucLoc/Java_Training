import java.util.HashSet;
import java.util.Set;

public class ContainsDulicate {
    public static void main(String[] args){
        int[] nums = new int[10];

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(uniques.contains(nums[i])){
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}

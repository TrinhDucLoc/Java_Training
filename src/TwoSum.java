import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        class Solution {
            public int[] twoSum(int[] nums, int target) {

// Code 3:
                HashMap<Integer, Integer> hashMap = new HashMap<>();
                for(int i=0; i<nums.length; i++){
                    if(hashMap.containsKey(target - nums[i])){
                        return new int[]{hashMap.get(target - nums[i]), i};
                    }
                    hashMap.put(nums[i], i);
                }
                return new int[]{};
            }
        }
    }
}

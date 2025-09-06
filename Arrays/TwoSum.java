// Two Sum Problem
// Link = https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            // second iteration should be start from i+1 to avoid same index conflict
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        // Return empty array if target not exist
        return new int[]{};
    }
}
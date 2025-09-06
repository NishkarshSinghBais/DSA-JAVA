// Move Zeroes
// Link : https://leetcode.com/problems/move-zeroes/

// Approach : Two Pointer

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){ // keep moving untill a non zero not find
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++; // waits for next non zero to swap find by for loop
            }
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {        
        for (int index = 0; index < nums.length; index++) {
            for (int j = index + 1; j < nums.length; j++) {
                if( nums[j] + nums[index] == target) {
                    return new int[] { index, j };
                }   
            }
        }
        
        return null;
    }
}
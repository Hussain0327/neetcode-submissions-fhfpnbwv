class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) return false;
        
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == cur) return true;
            }
            cur = nums[i];
        }
        return false;
    }
}
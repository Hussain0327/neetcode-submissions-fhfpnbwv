class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int highest = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                highest = (count > highest) ? count : highest;
            } else {
                count = 0;
            }
        }
        return highest;
    }
}
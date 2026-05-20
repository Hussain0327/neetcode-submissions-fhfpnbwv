class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] boxed = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) boxed[i] = nums[i];
        Arrays.sort(boxed, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) return freqA - freqB; 
            return b - a;
        });
        for (int i = 0; i < nums.length; i++) nums[i] = boxed[i];
        return nums;
    }
}
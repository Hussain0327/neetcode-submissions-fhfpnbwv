class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            int maxCount = -1;
            int maxNum = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int num = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount) {
                    maxCount = count;
                    maxNum = num;
                }
            }

            result[i] = maxNum;
            map.put(maxNum, -1);
        }

        return result;
    }
}
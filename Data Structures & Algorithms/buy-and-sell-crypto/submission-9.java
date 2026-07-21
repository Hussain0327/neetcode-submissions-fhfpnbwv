class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int cur = prices[i];
            int profit = 0;
            if (cur < buy) buy = cur;
            if (cur > buy) profit = cur - buy;
            if (profit > max) max = profit;
        }
        return max;
    }
}

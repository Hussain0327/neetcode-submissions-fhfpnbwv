class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int cur = 0;
            if (prices[i] > buy) cur = prices[i] - buy;
            if (prices[i] < buy) buy = prices[i];
            if (cur > profit) profit = cur;
        }
        return profit;
    }
}

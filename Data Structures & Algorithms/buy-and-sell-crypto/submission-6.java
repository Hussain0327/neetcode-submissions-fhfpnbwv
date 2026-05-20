class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            int cur = 0;
            if (sell > buy) cur = sell - buy;
            if (sell < buy) buy = sell;
            if (cur > profit) profit = cur;
        }
        return profit;
    }
}

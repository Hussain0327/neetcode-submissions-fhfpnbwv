class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int dif = 0;
            if (prices[i] > buy) dif = prices[i] - buy;
            if (dif > profit) profit = dif;
            if (prices[i] < buy) buy = prices[i];
        }
        return profit;

    }
}

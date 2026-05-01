class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currProfit = 0;
            if(prices[i] > buy) {
                currProfit = prices[i] - buy;
            }
            if (currProfit > maxProfit) {
                maxProfit = currProfit;
            }
            if (prices[i] < buy) {
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}
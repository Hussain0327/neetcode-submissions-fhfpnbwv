class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int buy = prices[0]; 
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int cur = prices[i];
            if (cur < buy) buy = prices[i];
            if (cur > buy) {
                int total = cur - buy;
                if (total > profit) profit = total;
                
            }
        }
        return profit;
    }
}

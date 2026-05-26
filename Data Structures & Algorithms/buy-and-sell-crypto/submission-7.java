class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int price : prices) {
            int cur = 0;
            if (price > buy) cur = price - buy;
            if (cur > profit) profit = cur;
            if (price < buy) buy = price;
        }
        return profit;
    }
}

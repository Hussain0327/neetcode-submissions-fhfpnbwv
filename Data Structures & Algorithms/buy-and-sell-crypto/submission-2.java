class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int cur = 0;
            if (prices[i] < buy) buy = prices[i];
            if (prices[i] > buy) {
                cur = prices[i] - buy;
            }
            if (cur > profit) profit = cur;

        }
        return profit;
        
    }
}


/*
profit can be 0, int profit = 0;
we can set buyDay = prices[0];
1 <= prices.length <= 100
0 <= prices[i] <= 100
may choose to not make any transactions
buy one day, sell next day
*/
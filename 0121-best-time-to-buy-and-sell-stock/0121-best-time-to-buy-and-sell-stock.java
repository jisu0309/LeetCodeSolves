class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        int[] maxarr = new int[prices.length];

        for(int i=prices.length-1; i>=0; i--){
            max = Math.max(max, prices[i]);
            maxarr[i] = max;
        }

        int profit = 0;
        for(int i=0; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, maxarr[i]-min);
        }

        return profit;
    }
}
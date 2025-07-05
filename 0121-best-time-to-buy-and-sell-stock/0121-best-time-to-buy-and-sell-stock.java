class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ret = 0;

        for (int i=1; i<prices.length; i++){
            if (min < prices[i]) {
                ret = Math.max(ret, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return ret;
    }
}
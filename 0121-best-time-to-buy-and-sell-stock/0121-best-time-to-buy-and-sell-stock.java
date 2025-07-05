class Solution {
    public int maxProfit(int[] prices) {
        int buy;
        int sell;
        int max = 0;
        int min = Integer.MAX_VALUE;

        int[] minarr = new int[prices.length];

        for(int i=0; i<minarr.length; i++){
            min = Math.min(min, prices[i]);
            minarr[i] = min;
            
            //System.out.printf("%d ", minarr[i]);
        }
        // [7,1,1,1,1,1]
        //System.out.printf("\n");

        int[] maxarr = new int[prices.length];

        for(int i=maxarr.length-1; i>=0; i--){
            max = Math.max(max, prices[i]);
            maxarr[i] = max;
            //System.out.printf("%d ", maxarr[i]);
        }
        // [7,6,6,6,6,4]
        //System.out.printf("\n");

        int profit = 0;
        for(int i=0; i<minarr.length; i++){
            //System.out.printf("profit:%d,  max[%d] min[%d]\n", profit, maxarr[i], minarr[i]);
            profit = Math.max(profit, maxarr[i]-minarr[i]);
        }



        return profit;
    }
}
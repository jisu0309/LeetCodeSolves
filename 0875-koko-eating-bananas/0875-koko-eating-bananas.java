class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int p:piles){
            max = Math.max(max, p);
        }
        int min = 1;
        int ret = max/2;

        while(max>=min){
            long sum = 0;
            for(int p:piles){
                // sum += Math.ceil((double) p/ret);
                sum += (p + ret - 1)/ret;
                // System.out.printf("%d+", sum);
            }
            
            // System.out.printf("\n%d-%d-%d -> %d\n\n", min, ret, max, sum);

            if(sum>h) {
                min = ret+1;
            } else {
                max = ret-1;
            }
            ret = min+(max-min)/2;
        }

        return ret;
    }
}
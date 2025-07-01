class Solution {
    public int search(int[] nums, int target) {
        int min=0;
        int max=nums.length-1;
        int now=max/2;

        while(min<max){
            if(nums[now]==target){
                return now;
            } else if(nums[now]>target){
                max = now-1;
                now = max-(max-min)/2;
            } else {
                min = now+1;
                now = min+(max-min)/2;
            }
        }
        
        return min!=max ? -1 : nums[min]==target ? min : -1;
    }
}
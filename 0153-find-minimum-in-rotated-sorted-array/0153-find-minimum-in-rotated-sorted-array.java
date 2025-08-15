class Solution {
    public int findMin(int[] nums) {
        int min=5001;
        for(int n:nums){
            min = Math.min(min, n);
        }
        return min;
    }
}
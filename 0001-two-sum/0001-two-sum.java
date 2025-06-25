// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ret = new int[2];
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if (nums[i]+nums[j] == target) {
//                     ret[0] = i;
//                     ret[1] = j;
//                 }
//             }
//         }
//         return ret;
//     }
// }







class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
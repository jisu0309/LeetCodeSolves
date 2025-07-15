class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int x=0;
        int y=numbers.length-1;

        while(numbers[x]+numbers[y]!=target){
            if(numbers[x]+numbers[y]<target){
                x = x+(y-x)/2;
            } else{
                y = y-(y-x)/2;
            }
        }

        return new int[]{x+1,y+1};
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1) return Integer.valueOf(tokens[0]);
        Stack<Integer> nums = new Stack<>();
        int ret = 0;

        for(String s:tokens){
            if(s.equals("+")){
                ret = nums.pop() + nums.pop();
                nums.push(ret);
            } else if(s.equals("-")){
                int tmp = nums.pop();
                ret = nums.pop() - tmp;
                nums.push(ret);
            } else if(s.equals("/")){
                int tmp = nums.pop();
                ret = nums.pop() / tmp;
                nums.push(ret);
            } else if(s.equals("*")){
                ret = nums.pop() * nums.pop();
                nums.push(ret);
            } else{
                nums.push(Integer.valueOf(s));
            }

            // System.out.printf("s=%s, ret=%d, stk=%d\n", s, ret, nums.peek());
        }
        
        return ret;
    }
}
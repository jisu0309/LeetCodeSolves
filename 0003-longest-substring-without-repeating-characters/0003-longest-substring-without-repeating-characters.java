class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int fr = 0;
        int now = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(now<s.length()){
            
            // System.out.printf("now=%d%s, fr=%d%s, max=%d\n", now, s.charAt(now), fr, s.charAt(fr), max);
            
            Integer last_position = map.get(s.charAt(now));
            if(last_position==null){
                map.put(s.charAt(now), now);
                now++;
            } else if(last_position<fr){
                now++;
            } else{
                max = Math.max(max, now-fr);
                map.put(s.charAt(now), now);
                fr = last_position + 1;
                now++;
            }
        }

        // System.out.printf("now=%d%s, fr=%d%s, max=%d\n", now, ' ', fr, s.charAt(fr), max);

        return Math.max(max, now-fr);
    }
}
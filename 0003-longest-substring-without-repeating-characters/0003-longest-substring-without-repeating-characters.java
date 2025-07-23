class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int fr = 0;
        int now = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(now<s.length()){
            Integer last_position = map.get(s.charAt(now));
            
            if(last_position==null){
                map.put(s.charAt(now), now);
                now++;                
            } else if(last_position<fr){
                now++;
            } else{
                max = Math.max(max, now-fr);
                map.put(s.charAt(now), now);
                while(fr<=last_position){
                    map.put(s.charAt(map.get(s.charAt(fr++))), null);
                }
            }
        }

        return Math.max(max, now-fr);
    }
}
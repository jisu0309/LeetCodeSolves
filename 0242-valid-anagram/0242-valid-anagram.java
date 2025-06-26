class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            Integer remain = map.get(c);
            if(remain==null || remain<=0) return false;
            map.put(c, remain-1);
        }
        return true;
    }
}
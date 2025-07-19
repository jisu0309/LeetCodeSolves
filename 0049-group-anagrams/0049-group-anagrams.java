class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { 
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] carr = new char[26];
            for(char c : strs[i].toCharArray()){
                carr[c-'a']++;
            }
            String st = new String(carr);

            if(map.get(st)==null){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}

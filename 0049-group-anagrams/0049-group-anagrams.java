class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str:strs){
            char[] arr = new char[26];
            for(char c:str.toCharArray()){
                arr[c-'a']++;
            }
            String arrstr = String.valueOf(arr);
            List<String> get = map.get(arrstr);

            if(get==null) {
                map.put(arrstr, new ArrayList<>());  
            }
            get.add(str);
        }

        return new ArrayList<>(map.values());
    }
}
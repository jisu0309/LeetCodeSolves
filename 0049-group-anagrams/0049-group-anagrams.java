class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // for(String str:strs){
        //     int[] arr = new int[26];
        //     for(char c:str.toCharArray()){
        //         arr[c-'a']++;
        //     }
        //     String arrstr = String.valueOf(arr);
        //     System.out.printf("str=%s\n", arrstr);

        //     Integer get = map.get(arrstr);
        //     if(get==null) {
        //         ret.add(new ArrayList<>(Arrays.asList(str)));
        //         map.put(arrstr, ret.size()-1);
        //     } else{
        //         ret.get(get).add(str);
        //     }

        // }


        for(String str:strs){
            char[] carr = str.toCharArray();
            Arrays.sort(carr);
            String sorted = String.valueOf(carr);
            Integer get = map.get(sorted);

            // System.out.printf("str=%s, sorted=%s, get=%s\n", str, sorted, get);

            if(get==null) {
                ret.add(new ArrayList<>(Arrays.asList(str)));
                map.put(sorted, ret.size()-1);
            } else{
                ret.get(get).add(str);
            }

        }

        return ret;
    }
}
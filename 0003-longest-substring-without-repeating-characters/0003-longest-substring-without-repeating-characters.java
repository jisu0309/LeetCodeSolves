// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length() == 0) return 0;

//         HashMap<Character, Integer> map = new HashMap<>();
//         char[] split = s.toCharArray();      
//         int max = 0;
//         int start = 0;

//         for(int i=0; i<split.length; i++){
//             char c = split[i];

//             if(map.get(c)!=null && map.get(c) >= start){ // 시작점 이후에 나왔던 문자이면
//                 max = Math.max(max, i-start);            // 시작점에서 여기까지를 max 값으로 지정하고
//                 start = map.get(c)+1;                    // 이 글자가 없는 부분부터 시작점으로 세팅해서 마저 살펴보기
//             }
//                 map.put(c, i);                          // 나온적 없는 문자이면 위치만 저장
//         }

//         return Math.max(max, split.length-start);

//     }
// }




// // split 대신 charAt으로 써본거...
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(map.get(c)!=null && map.get(c) >= start){
                max = Math.max(max, i-start);
                start = map.get(c)+1;
            }
                map.put(c, i);
        }

        return Math.max(max, s.length()-start);

    }
}
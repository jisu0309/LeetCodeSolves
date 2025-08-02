// class Solution {
//     public int characterReplacement(String s, int k) {
//         int kcnt = 0;
//         int lcnt = 0;
//         int left = 0;
//         int right = 0;
//         int bookmark = 0;
//         // int[] used = new int[26];

//         char target = 'A';

//         while(right<s.length()){
//             char now = s.charAt(right);
//             if(target==now){
//                 lcnt++;
//                 right++;
//             } else if(kcnt<k){
//                 lcnt++;
//                 right++;
//                 kcnt++;
//             } else {

//             }
//         }
//     }
// }


class Solution {
    public int characterReplacement(String s, int k) {
        char[] ca = s.toCharArray();  
        int[] used = new int[26];      
        int max = 0;
        int stt = 0;
        int targetCnt=0;

        for(int i=0; i<ca.length; i++){
            max++;
            used[ca[i]-'A']++;
            
            targetCnt = Math.max(targetCnt, used[ca[i]-'A']);
            
            
            while(max-targetCnt > k){
                max--;
                used[ca[stt]-'A']--;
                stt++;

                // for(int u : used){
                //     targetCnt = Math.max(targetCnt, u);
                // }
            }

        }
        return max;
    }
}
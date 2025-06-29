class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int fr = 0;
        int bk = s.length()-1;

        while(fr<=bk){
            if(!checkAlpaNumeric(s.charAt(fr))){
                fr++;
                continue;
            } else if(!checkAlpaNumeric(s.charAt(bk))){
                bk--;
                continue;
            } else if(s.charAt(fr++) != s.charAt(bk--)) {
                return false;
            }
        }

        return true;
    }

    boolean checkAlpaNumeric(char c){
        if(c>='a' && c<='z') return true;
        if(c>='0' && c<='9') return true;
        return false;
    }
}
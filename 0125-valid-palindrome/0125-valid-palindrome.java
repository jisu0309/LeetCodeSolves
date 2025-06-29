class Solution {
    public boolean isPalindrome(String s) {
        int fr = 0;
        int bk = s.length()-1;
        s=s.toLowerCase();

        while(fr<bk){
            if(!checkAlNu(s.charAt(fr))){
                fr++;
            } else if(!checkAlNu(s.charAt(bk))){
                bk--;
            } else if(s.charAt(fr)!=s.charAt(bk)){
                return false;
            } else {
                fr++;
                bk--;
            }
        }

        return true;
    }

    public boolean checkAlNu(char c){
        if(c>='a'&&c<='z') return true;
        if(c>='0'&&c<='9') return true;
        return false;
    }
}
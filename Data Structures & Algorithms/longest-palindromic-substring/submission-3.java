class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int resLen = 0;

        for(int i =0; i<s.length();i++){
            // odd
            int l = i;
            int r = i;
            while(0<=l && r<s.length() && s.charAt(l) == s.charAt(r)){
                int curLen = r-l+1;
                if(curLen>resLen){
                    resLen = curLen;
                    start = l;
                }
                l--;
                r++;
            }

            // even
            l = i;
            r = i+1;
            while(0<=l && r<s.length() && s.charAt(l) == s.charAt(r)){
                int curLen = r-l+1;
                if(curLen>resLen){
                    resLen = curLen;
                    start = l;
                }
                l--;
                r++;
            }

        }
        return s.substring(start, start+resLen);
    }
}

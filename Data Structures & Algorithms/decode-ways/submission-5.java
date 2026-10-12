class Solution {
    public int numDecodings(String s) {
        int prev = 1;
        int cur = 1;
        if (s.charAt(0)=='0'){
            cur = 0;
        }
        
        for(int i=1; i<s.length(); i++){
            int next = 0;
            if (s.charAt(i)!='0'){
            next = next+cur;
        }

            if((s.charAt(i-1) == '1' )|| (s.charAt(i-1) == '2' && s.charAt(i)<= '6')){
               next = next+prev;
               }

            prev = cur;
            cur =  next;
        }
        return cur;
    }
}

class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;
        int oneBack = 1;
        int twoBack = 1;
        for(int i=1; i<s.length();i++){
            int current = 0;
            int twoDigits = Integer.parseInt(s.substring(i-1, i+1)); // get int from i-1 to 1
            if(s.charAt(i) != '0') current = oneBack;
            if(twoDigits >= 10 && twoDigits<=26) current += twoBack;
            twoBack = oneBack;
            oneBack = current; 
        }
        return oneBack;
    }
}

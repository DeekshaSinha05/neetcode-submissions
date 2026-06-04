class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;

        Set<Character> sliding = new HashSet<>();
        int left =0, maxlength=0;
        for(int right=0; right<s.length(); right++)
        { 
            char c = s.charAt(right);
            while(sliding.contains(c))
                {
                    sliding.remove(s.charAt(left));
                    left++;
                }
            sliding.add(c);
            maxlength = Math.max(maxlength, right-left+1);
        } 
        return maxlength;
}

}

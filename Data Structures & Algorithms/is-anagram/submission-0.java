class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] freq = new int[26];
        for(char c: sArr){
            freq[c-'a']++; 
        }
        for(char c: tArr){
            freq[c-'a']--; 
        }
        
        for(int i: freq){
            if(i!=0) return false; 
        }
        return true;
    }
}

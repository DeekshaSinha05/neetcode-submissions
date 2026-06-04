class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int matches =0, left =0;
        // check from 0 to s1 length
        for(int i =0; i<s1.length(); i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;}

        for(int i =0; i<26; i++)
            if(freq1[i] == freq2[i]) matches++;
        
        // slide  
        for(int right = s1.length(); right< s2.length(); right++){
            if(matches ==26) return true;
            int i = s2.charAt(right)-'a'; //new char
            freq2[i]++;
            if(freq1[i] == freq2[i]) matches++;
            else if(freq1[i] +1 == freq2[i]) matches--; 

            i=s2.charAt(left)-'a'; 
            freq2[i]--;
            if(freq1[i] == freq2[i]) matches++;
            else if(freq1[i] -1 == freq2[i]) matches--;
            left++;
        }

        
    return matches == 26;       
    }
}

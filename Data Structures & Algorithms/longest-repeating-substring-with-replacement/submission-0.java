class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character, Integer>  freqMap = new HashMap<> ();
      int left =0,  maxFreq =0, result = 0;
      
      for(int right =0; right < s.length(); right++){
        char cur = s.charAt(right);
        int curFreq= freqMap.getOrDefault(cur, 0) + 1; 
        freqMap.put(cur, curFreq);
        
        maxFreq = Math.max(maxFreq, curFreq);
     
        while(right-left+1 - maxFreq > k){ // not valid
            //shift left pointer
            char leftChar= s.charAt(left);
            freqMap.put(leftChar, freqMap.get(leftChar) - 1);
            left++;
            
        }
        
        result = Math.max(result, right-left+1);
      }
      return result;
    }
}

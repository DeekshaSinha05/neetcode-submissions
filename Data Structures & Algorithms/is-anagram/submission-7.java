class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
                if (!frequencyMap.containsKey(s.charAt(i)))
                frequencyMap.put(s.charAt(i), 0);

               int val = frequencyMap.get(s.charAt(i))+1;
               frequencyMap.put(s.charAt(i), val);
        }

        for(int i = 0; i<t.length(); i++){
                if (!frequencyMap.containsKey(t.charAt(i)))
                return false;

               int val = frequencyMap.get(t.charAt(i))-1;
               frequencyMap.put(t.charAt(i), val);
               if(val<0) return false;
        }

        for(Map.Entry<Character, Integer> entry: frequencyMap.entrySet()){
                if(entry.getValue()!=0)
                    return false;
        }
        return true;
    }
}
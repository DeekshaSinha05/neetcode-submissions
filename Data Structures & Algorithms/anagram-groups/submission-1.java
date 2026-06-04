class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> aMap = new HashMap<> ();
        char[] sArr;
        String key;
        for(String s: strs){
            int[] freq = new int[26];
            sArr = s.toCharArray();
            for(char c: sArr) freq[c-'a']++;
            key = Arrays.toString(freq);
            aMap.computeIfAbsent(key, k-> new ArrayList<> ()).add(s);
        }

        return new ArrayList(aMap.values());
        
    }
}

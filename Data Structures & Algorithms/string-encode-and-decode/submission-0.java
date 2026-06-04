class Solution {


    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder enStr = new StringBuilder();
        for(String str: strs) enStr.append(str.length()).append('#').append(str);
        return enStr.toString();
    }
   // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<> ();
    
        for(int i=0;i<s.length();){
            int delimiter = s.indexOf('#',i);
            int strLength = Integer.parseInt(s.substring(i,delimiter));
            String word = s.substring(delimiter+1,delimiter+strLength+1);
            decoded.add(word);
            i=delimiter+strLength+1;
        }
        return decoded;
    }
}

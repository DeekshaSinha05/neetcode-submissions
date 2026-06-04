class Solution {
    List<String> result = new ArrayList<> ();
    Map<Character, String> digitsCharMap = Map.of(
        '2',"abc",
        '3',"def",
        '4',"ghi",
        '5',"jkl",
        '6',"mno",
        '7',"pqrs",
        '8',"tuv",
        '9',"wxyz"
    );
    String digits;
    public List<String> letterCombinations(String digits) {
      if(digits==null || digits.length()==0) return new ArrayList<String> ();
      this.digits = digits;
      backtrack(0,new StringBuilder());
      return result;  
    }
    private void backtrack(int start, StringBuilder path){
        if(path.length() == digits.length()) {
            result.add(path.toString());
            return;
        }
        char c = digits.charAt(start);
        String s = digitsCharMap.get(c);
        for(int i=0; i<s.length(); i++){
            path.append(s.charAt(i));
            backtrack(start+1, path);
            path.deleteCharAt(path.length()-1);
        }


    }

}

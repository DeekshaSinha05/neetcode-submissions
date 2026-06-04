class Solution {
    String s;
    List<List<String>> result = new ArrayList<> ();
    public List<List<String>> partition(String s) {
        this.s = s;
        backtrack(0, new ArrayList<> ());
        return result;
    }

    private void backtrack(int start, List path){
        if(start == s.length()){
            result.add(new ArrayList<> (path));
            return;
        }
        for(int i = start; i<s.length(); i++){
            if(isPalindrom(start, i)){
                path.add(s.substring(start, i+1));
                backtrack(i+1, path);
                path.remove(path.size()-1);
            }
        }



        return;
    }

    private boolean isPalindrom(int left, int right){
        while(left<right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}

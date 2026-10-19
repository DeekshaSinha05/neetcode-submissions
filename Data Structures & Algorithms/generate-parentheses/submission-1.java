class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        backtrack(n, 0, 0, cur);
        return res;
    }

    private void backtrack(int n, int open, int close, StringBuilder cur ){
        if(open==n && close==n){
            res.add(new String(cur));
            return;
        }
        if(open<n){
            cur.append("(");
            backtrack(n, open+1, close, cur);
            cur.deleteCharAt(cur.length()-1);
            //backtrack(n, i+1, close, cur);
        }
        if(close<open){
            cur.append(")");
            backtrack(n, open, close+1, cur);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}

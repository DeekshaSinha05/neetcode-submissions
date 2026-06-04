class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        backtrack(n, sb, 0, 0);
        return result;
    }

    private void backtrack(int n, StringBuilder sb, int open, int close){
        if(sb.length() == 2*n){
            result.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            backtrack(n, sb, open+1, close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            backtrack(n, sb, open, close+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}

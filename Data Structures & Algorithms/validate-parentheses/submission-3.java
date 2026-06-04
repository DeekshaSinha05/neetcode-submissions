class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char cur, prev;
        for (int i=0; i<s.length();i++){
            cur = s.charAt(i);
            if(cur=='['||cur=='{'||cur=='(')
                {
                    stack.push(cur);
                }
            else{
                if(stack.isEmpty()) return false;
                prev = stack.pop();
                if (cur==']' && prev =='[' ||
                    cur=='}' && prev =='{' || 
                    cur==')' && prev =='(' ) continue;
                
                else return false;
            }
        }
        return stack.isEmpty();
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int num1,num2,num3;
        for(int i=0;i<tokens.length;i++){
            String cur = tokens[i];
            if(cur.equals("+")){
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num2+num1;}
            else if(cur.equals("-")){
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num2-num1;
            }else if(cur.equals("*")){
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num2*num1;
            }else if(cur.equals("/")){
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num2/num1;
            }else{
                num3= Integer.parseInt(cur);
            }
            stack.push(num3);
        }
        return stack.pop();
    }
}

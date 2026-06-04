class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[t.length];
        result[t.length-1]=0;
        stack.push(0);
        for(int i=1;i<t.length;i++){
            while(!stack.isEmpty() && t[stack.peek()]<t[i]){
                result[stack.peek()]= i-stack.pop();
            }
            stack.push(i);

        }
        return result;
    }
}

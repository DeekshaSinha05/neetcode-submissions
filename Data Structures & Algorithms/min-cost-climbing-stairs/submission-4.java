class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev = 0;
        int cur = 0;
        
        for (int i =2; i<=cost.length; i++){
            int next = Math.min(cur + cost[i-1], prev + cost[i-2]);
            prev = cur;
            cur = next;
        }
        return cur;
    }
}

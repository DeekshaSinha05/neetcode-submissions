class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int cur = 0;
        for (int n: nums){
            int next = Math.max(cur, prev+n);
            prev = cur;
            cur = next;
        }
        return cur;
    }
}

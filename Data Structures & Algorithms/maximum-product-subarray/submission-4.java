class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int best = nums[0];
        for(int i =1; i<nums.length; i++){
            int n = nums[i];
            int p1 = max*n;
            int p2 = min*n;
            max = Math.max(n, Math.max(p1, p2));
            min = Math.min(n, Math.min(p1, p2));
            best = Math.max(best, max);
        }
        return best;
    }
}

class Solution {
    public int climbStairs(int n) {
    if (n <= 2) return n;
    int prev2 = 1; // One way to climb 1 step
    int prev1 = 2; // Two ways to climb 2 steps: (1+1), (2)
    for (int i = 3; i <= n; i++) {
        int cur = prev1 + prev2;
        prev2 = prev1;
        prev1 = cur;
    }
    return prev1;
    }
}

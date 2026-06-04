class Solution {
    public int getSum(int a, int b) {

        // Example: a = 5 (0101), b = 7 (0111)
        // Iteration 1:
        // carry = (0101 & 0111) << 1 = 0101 << 1 = 1010
        // a     = 0101 ^ 0111 = 0010
        // b     = 1010

        // Iteration 2:
        // carry = (0010 & 1010) << 1 = 0010 << 1 = 0100
        // a     = 0010 ^ 1010 = 1000
        // b     = 0100

        // Iteration 3:
        // carry = (1000 & 0100) << 1 = 0000
        // a     = 1000 ^ 0100 = 1100
        // b     = 0000  → stop

        // Final result: 1100 (12)

        while (b != 0) {
            int carry = (a & b) << 1; // (a & b) find carry bits and << shift left
            a = a ^ b;               // sum without carry
            b = carry;               // propagate carry
        }

        return a;
    }
}

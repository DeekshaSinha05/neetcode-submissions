class Solution {
    public int reverseBits(int n) {
        int result =0;
        for (int i =0; i<32;i++){
            int bit = (n>>i) & 1;
            result += bit << (31-i) | 0;
        }
        return result;
    }
}

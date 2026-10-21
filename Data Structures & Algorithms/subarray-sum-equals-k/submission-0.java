class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        int cur =0;
        int res = 0;
        for(int n:nums){
           cur += n;
           int diff = cur-k;
           if(preSum.containsKey(diff)){
                res += preSum.get(diff);
                }
            
            if(!preSum.containsKey(cur)){
                preSum.put(cur, 0);
            }
            preSum.put(cur, preSum.get(cur)+1);
        }
        return res;
    }
}
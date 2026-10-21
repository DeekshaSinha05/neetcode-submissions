class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> prefix = new HashMap<>();

        int zeros = 0;
        int ones = 0;
        int maxLen = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0) zeros++;
            else ones++;
            int diff = ones-zeros;
            if(diff ==0){
                maxLen= Math.max(maxLen, i+1);
                continue;
                }
                
            if(!prefix.containsKey(diff))
                prefix.put(diff, i);
            else
                maxLen= Math.max(maxLen, i-prefix.get(diff));

        }
        return maxLen;
    }
}
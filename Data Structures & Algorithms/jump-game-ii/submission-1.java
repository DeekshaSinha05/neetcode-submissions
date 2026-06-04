class Solution {
    public int jump(int[] nums) {
      int curEnd =0, farthest =0, count =0;
      for(int i=0;i<nums.length-1;i++){
        farthest = Math.max(i+nums[i], farthest);
        if(curEnd==i){ 
            count++;
            curEnd = farthest;
            }
      } 
      return count;
    }
}

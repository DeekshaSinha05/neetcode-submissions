class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2;i++){
            if(nums[i]>0)break;
            if(i>0 && nums[i]==nums[i-1]) continue; // skip duplicate
            int l=i+1,r=n-1;
            int target = -nums[i];
            while(l<r){
                if(nums[l]+nums[r]==target){
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1] )l++;
                    while(l<r && nums[r]==nums[r+1])r--;

                } 
                else if(nums[l]+nums[r]>target) r--;
                else if(nums[l]+nums[r]<target) l++;
            }
        }
        return result;
    }
}

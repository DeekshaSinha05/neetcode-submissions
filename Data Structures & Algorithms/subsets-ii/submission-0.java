class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>> ();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return result;  
    }

    private void backtrack(int[] nums, int start, List<Integer> path){
            
        result.add(new ArrayList<>(path));
            
        for(int i =start; i<nums.length; i++){
            if(i>start && nums[i] == nums[i-1]) continue;
            path.add(nums[i]); // add
            backtrack(nums, i+1, path); // backtrack
            path.remove(path.size() - 1); // remove
        }
    }
}

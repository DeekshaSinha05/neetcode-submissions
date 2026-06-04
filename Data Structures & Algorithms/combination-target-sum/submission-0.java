class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>> ();
    int[] nums;
    int target;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        backtrack(0, target, new ArrayList());
        return result;
    }

    private void backtrack(int start, int pending, List<Integer> path ){

        if (pending == 0){ 
            result.add(new ArrayList<> (path));
            return;
            }

        if (pending < 0) return;
        for(int i =start; i<nums.length; i++){
            path.add(nums[i]);
            backtrack(i, pending-nums[i], path);
            path.remove(path.size()-1);
        }
    }
}

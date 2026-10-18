class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        backtrack(nums,new ArrayList<Integer>(),  0, target);
        return res;
    }

    private void backtrack(int[] nums, List<Integer>cur, int i, int target){
        if(target == 0){
            res.add(new ArrayList(cur));
            return;
        }
        if(target<0 || i>=nums.length)
            return;

        cur.add(nums[i]);
        backtrack(nums, cur,  i, target-nums[i]);
        cur.remove(cur.size()-1);
        backtrack(nums, cur, i+1, target);
    
    }
    }

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backtrack(nums, new ArrayList<>());
        return res;
    }

    private void backtrack(int[] nums, List<Integer> cur){
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int n:nums){
            if(cur.contains(n)) continue;
            cur.add(n);
            backtrack(nums, cur);
            cur.remove(cur.size()-1);

        }
        
    }
}

class Solution {
    List<List<Integer>> res;
    
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList <>();
        res.add(new ArrayList <>());

        for(int n: nums){
            int size = res.size();
            for(int i =0; i<size; i++){
                List<Integer> cur = new ArrayList<> (res.get(i));
                cur.add(n);
                res.add(cur);
            }
        }
        
        return res;
    }
/*
    private void backtracking(int[] nums, int i, List<Integer> cur){
        if(i >= nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }

        cur.add(nums[i]);
        backtracking(nums, i+1, cur);
        cur.remove(cur.size()-1);
        backtracking(nums, i+1, cur);

        return;
    } */
}

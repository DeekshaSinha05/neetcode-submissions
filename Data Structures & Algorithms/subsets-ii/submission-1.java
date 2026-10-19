class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return res;
    }
    private void backtrack(int[] nums, int i, List<Integer> cur){
        if(i>= nums.length)
            return;

        cur.add(nums[i]);
        backtrack(nums, i+1, cur);
        if(!res.contains(cur))
            res.add(new ArrayList<>(cur));
        cur.remove(cur.size()-1);
        backtrack(nums, i+1, cur);
        if(!res.contains(cur))
            res.add(new ArrayList<>(cur));


    }


}

class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>> ();
    
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, new boolean[nums.length] , new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, boolean[] visited, List<Integer> path){
            if(path.size() == nums.length)
                result.add(new ArrayList<>(path));
            
            for(int i =0; i<nums.length; i++){
                if(visited[i]) continue;
                visited[i] = true; 
                path.add(nums[i]); // add
                backtrack(nums, visited, path); // backtrack
                path.remove(path.size() - 1); // remove
                visited[i] = false;
            }

    }
}

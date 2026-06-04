class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>> ();
    int[] candidates;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        Arrays.sort(candidates);
        backtack(target, 0, new ArrayList<> ());
        return result;
    }

    private void backtack(int pending, int start, ArrayList<Integer> path){
        if(pending == 0) {
            result.add(new ArrayList<> (path));
            return;
            }

        if(pending<0) return;

        for(int i=start; i<candidates.length; i++){
            if(i>start && candidates[i] == candidates[i-1]) continue;
            path.add(candidates[i]);
            backtack(pending - candidates[i], i+1, path);
            path.remove(path.size()-1);
        }
    }
}

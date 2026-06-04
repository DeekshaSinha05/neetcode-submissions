class Solution {
    public int[][] insert(int[][] intervals, int[] ni) {
       List<int[]> res = new ArrayList<>();
       for(int[] i: intervals){
            if(ni == null|| i[1]<ni[0]){
                res.add(i);
                }
            else if(i[0]>ni[1]){
                res.add(ni);
                res.add(i);
                ni = null;
                }
            else {
                ni[0] = Math.min(i[0], ni[0]);
                ni[1] = Math.max(i[1], ni[1]);
            }
       } 
       if(ni != null) res.add(ni);
       return res.toArray(new int[res.size()][]);
    }
}

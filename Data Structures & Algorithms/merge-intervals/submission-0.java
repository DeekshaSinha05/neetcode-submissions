class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, (a,b)->a[0]-b[0]);
      List<int[]> merged = new ArrayList<>();
      merged.add(intervals[0]);
      int[] cur = intervals[0];
      for(int i=1; i<intervals.length; i++){
        int[] next = intervals[i];

        if(next[0]<=cur[1])
            cur[1] = Math.max(next[1],cur[1]);
        else {
            cur = next;
            merged.add(cur);
        }

      }
      return merged.toArray(new int[merged.size()][]);
    }
}

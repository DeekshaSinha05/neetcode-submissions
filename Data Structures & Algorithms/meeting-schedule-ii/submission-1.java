/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        List<Integer> starts = new ArrayList<>();
        List<Integer> ends = new ArrayList<>();
        int n = intervals.size(), count=0, maxCount =0;
        for(Interval i: intervals){
            starts.add(i.start);
            ends.add(i.end);
        }
        starts.sort((a,b) -> a.compareTo(b));
        ends.sort((a,b) -> a.compareTo(b));

        int sPointer =0, ePointer =0;
        while(sPointer<n){
            if(starts.get(sPointer) >= ends.get(ePointer) && ePointer<n){
                count--;
                ePointer++;
            }
            count++;
            sPointer++;
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}

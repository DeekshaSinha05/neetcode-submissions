class Solution {
    public int longestConsecutive(int[] nums) {
        int maxStreak = 0;
        int curStreak = 0;
        Set<Integer> num_set = new HashSet<> ();
        for(int num: nums){
            num_set.add(num);
        }
        for(int num: nums){
            
            if(!num_set.contains(num-1)){
                curStreak=1;
                int cur = num;
                while(num_set.contains(cur+1)){
                curStreak++;
                cur+=1;
            } 
            }
            maxStreak = Math.max(maxStreak, curStreak);
        }
    return maxStreak;
    }
}

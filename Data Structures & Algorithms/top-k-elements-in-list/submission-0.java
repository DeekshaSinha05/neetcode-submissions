class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        int[] result = new int[k];
        int id = 0;

        for(int i=0; i<freq.length; i++) 
            freq[i] = new ArrayList<>();

        for(int n: nums) 
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);

        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet())
            freq[entry.getValue()].add(entry.getKey());

        for(int i=freq.length-1; i>0 && id<k; i--)
            for(int n: freq[i]){
                result[id++] = n;
                if(id == k) return result;
            } 

        return result;
    }
}

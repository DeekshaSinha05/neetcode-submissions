class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null) return nums;
        int[] result = new int[2];
        Map<Integer,Integer> comp = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            //comp.computeIfAbsent(target-nums[i], k->new ArrayList<>()).add(i);
            if(comp.containsKey(nums[i])){
                result[0]= comp.get(nums[i]);
                result[1]=i;
                return result;
            }else
            comp.put(target-nums[i], i);

        }

        return new int[0];
    }
}

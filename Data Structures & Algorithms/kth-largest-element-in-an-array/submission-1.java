class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    public int findKthLargest(int[] nums, int k) {
        for(int n: nums){
            pq.add(n);
        }

        for(int i =0; i<k-1;i++){
            pq.poll();
        }

        return pq.peek();  
    }
}

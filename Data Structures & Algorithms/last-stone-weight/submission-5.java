class Solution {

    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<> (Collections.reverseOrder());
    if (stones.length == 0) return 0;
    for(int n: stones)
        pq.add(n); 

    
    if (pq.size() == 1) return pq.poll();

    while(pq.size()>1){

        int a = pq.poll();
        int b = pq.poll();
        if(a == b) continue;
        pq.add(a-b);

    }

    return pq.isEmpty()?0:pq.poll();

    }
}

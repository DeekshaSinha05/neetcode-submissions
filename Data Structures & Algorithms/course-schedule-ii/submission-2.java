class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<Integer> completed = new ArrayList<Integer>();
        Map<Integer, List<Integer>> adj = new HashMap<Integer, List<Integer>>();
        for(int[] p: prerequisites){
            if(!adj.containsKey(p[1]))
                adj.put(p[1], new ArrayList<Integer>());

            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> q =  new LinkedList<>();
        for(int i =0; i< numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
                completed.add(i);
                }
        }

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int n: adj.getOrDefault(cur, Collections.emptyList())){
                indegree[n]--;
                if(indegree[n] == 0){
                q.add(n);
                completed.add(n);
                }
            }
        }

        int[] result = new int[numCourses];
        if(completed.size()!=numCourses)
            return new int[0];
        for(int i=0; i<numCourses; i++){
            result[i] = completed.get(i);
        }

        return result;

    }
}

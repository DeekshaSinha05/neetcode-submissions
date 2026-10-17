class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        Map<Integer, List<Integer>> adj = new HashMap<Integer, List<Integer>>();
        for(int[] p: prerequisites){
            if(!adj.containsKey(p[1]))
                adj.put(p[1], new ArrayList<Integer>());

            indegree[p[0]]++;
            adj.get(p[1]).add(p[0]);
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        int finish = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            finish++;
            for(int n: adj.getOrDefault(cur, Collections.emptyList())){
                indegree[n]--;
                if(indegree[n] == 0){
                    q.add(n);
                }
            }

        }

        return finish==numCourses;
    }
}

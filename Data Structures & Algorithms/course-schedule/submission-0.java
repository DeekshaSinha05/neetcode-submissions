class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> dependeciesMap = new HashMap<>();
        Map<Integer, Integer> indegreeMap = new HashMap<>();
        Queue<Integer> q = new LinkedList ();

        for(int i=0; i<numCourses; i++){
            dependeciesMap.put(i,new ArrayList<>());
            indegreeMap.put(i,0);
        }
        
        for(int[] p: prerequisites){
            int pre = p[1];
            int course = p[0];
            dependeciesMap.get(pre).add(course);
            indegreeMap.put(course, indegreeMap.get(course) + 1);
        }

        for(int i=0; i<numCourses; i++){
            if (indegreeMap.get(i) == 0) q.add(i);
        }
        int processed = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            processed++;
            for(int d: dependeciesMap.get(cur)){
                indegreeMap.put(d,indegreeMap.get(d)-1);
                if (indegreeMap.get(d) == 0)
                    q.add(d);
            }
        }
    return processed == numCourses;
    }
}

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> dependeciesMap = new HashMap<>();
        Map<Integer, Integer> indegreeMap = new HashMap<>();
        Queue<Integer> q = new LinkedList ();
        int[] order = new int[numCourses];
        int count = 0;

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
        

        while(!q.isEmpty()){
            int cur = q.poll();
            
            order[count++] = cur;
            for(int d: dependeciesMap.get(cur)){
                indegreeMap.put(d,indegreeMap.get(d)-1);
                if (indegreeMap.get(d) == 0)
                    q.add(d);
            }
        }
        
    return count==numCourses?order:new int[0];
    }
}

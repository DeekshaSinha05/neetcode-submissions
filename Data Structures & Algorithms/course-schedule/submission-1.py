class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        graph = [[] for _ in range(numCourses)]
        indegree = [0] * numCourses
        for c, p in prerequisites:
            graph[p].append(c)
            indegree[c] += 1
        queue = deque((i for i in range(numCourses) if indegree[i] == 0))
        count = 0
        while queue:
            cur = queue.popleft()
            count += 1
            for nei in graph[cur]:
                indegree[nei] -= 1
                if indegree[nei] == 0:
                    queue.append(nei)

        
        return count == numCourses
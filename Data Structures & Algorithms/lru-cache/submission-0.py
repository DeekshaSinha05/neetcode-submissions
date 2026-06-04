class Node:
    left, right = None, None
    def __init__(self, key, val):
        self.key, self.val = key, val
        self.prev, self.next = None, None

class LRUCache:

    def __init__(self, capacity: int):
        self.cap = capacity
        self.cacheMap = {} # map for key node
        self.left, self.right = Node(0,0), Node(0,0)
        self.left.next, self.right.prev = self.right, self.left
        

    def get(self, key: int) -> int:
        if key in self.cacheMap:
            self.remove(self.cacheMap[key])
            self.insert(self.cacheMap[key])
            return self.cacheMap[key].val
        return -1
        

    def put(self, key: int, value: int) -> None:
        if key in self.cacheMap:
            self.remove(self.cacheMap[key])
        self.cacheMap[key] = Node(key, value)
        self.insert(self.cacheMap[key])

        if len(self.cacheMap)>self.cap:
            lru = self.left.next
            self.remove(lru)
            del self.cacheMap[lru.key]



    def remove(self, node):
        prevNode, nextNode = node.prev, node.next
        prevNode.next = nextNode
        nextNode.prev = prevNode


    def insert(self, node):
        prevNode, nextNode = self.right.prev, self.right
        prevNode.next = node
        nextNode.prev = node
        node.next = nextNode
        node.prev = prevNode
        
        

class WordDictionary:

    def __init__(self):
        self.root = TrieNode()
        
    def addWord(self, word: str) -> None:
        cur = self.root
        for c in word:
            if c not in cur.children:
                cur.children[c] = TrieNode()
            cur = cur.children[c]
        cur.endOfWord = True

    def search(self, word: str) -> bool:
        return self.dfs(0, self.root, word)
    
    def dfs(self, j, node, word):
        cur = node
        for i in range(j, len(word)):
            c = word[i]
            if c == ".":
                for child in cur.children.values():
                    if self.dfs(i+1, child, word):
                        return True
                return False
            else: 
                if c not in cur.children:
                    return False
                cur = cur.children[c]
        return cur.endOfWord

        
class TrieNode:
    
    def __init__(self):
        self.children = {}
        self.endOfWord = False
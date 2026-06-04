/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> copyMap = new HashMap<> ();
        Node cur=head;
        while(cur!=null){
            Node copyNode = new Node(cur.val);
            copyMap.put(cur, copyNode);
            cur= cur.next;
        }
        cur=head;
        while(cur!=null){
            Node copyNode = copyMap.get(cur);
            Node copyNext = copyMap.get(cur.next);
            Node copyRandom = copyMap.get(cur.random);
            copyNode.next = copyNext;
            copyNode.random = copyRandom;
            cur= cur.next;
        }
        return copyMap.get(head);
    }
}

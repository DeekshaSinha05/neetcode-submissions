/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;

        while(l2!=null&&l2.next!=null&&l2.next.next!=null){
            l1=l1.next;
            l2=l2.next.next;
            if(l1==l2) return true;
        }
        return false;
    }
}

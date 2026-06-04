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
    public void reorderList(ListNode head) {
      // find middle
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        

      // reverse
        ListNode prev = null, cur = slow.next;
        slow.next=null;
        while(cur!=null){
            ListNode curNext = cur.next;
            cur.next =prev;
            prev = cur;
            cur = curNext;
        }

      // merge
      ListNode first = head, second = prev;
      while(second!=null){
        ListNode tmp1 = first.next;
        ListNode tmp2 = second.next;
        first.next = second;
        second.next = tmp1;

        first = tmp1;
        second = tmp2;

      }



    }
}

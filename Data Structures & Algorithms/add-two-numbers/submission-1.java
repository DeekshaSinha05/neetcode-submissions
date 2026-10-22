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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        
        ListNode res = new ListNode();
        ListNode resRoot = res;
        while(l1!=null || l2 !=null || carry != 0){
            int curSum = 0;
            if(l1 != null){
                curSum += l1.val;
                l1 = l1.next;
                }
            if(l2 != null){
                curSum += l2.val;
                l2 = l2.next;
                }
            curSum += carry;
            if (curSum>=10)
                carry = 1;
            else carry = 0;
            
            res.val = curSum%10;
            if (l1!=null || l2 !=null || carry != 0){
            ListNode next = new ListNode();
            res.next = next;
            res = next;}
        
        }
        return resRoot;
    }
}

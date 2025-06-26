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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        for(int i = 0; i < k; i++){
            if(curr == null){
                return head;
            }
            curr = curr.next;
        }

        ListNode a = null;
        ListNode b = null;
        curr = head;
        for(int i = 0; i < k; i++){
            b = curr.next;
            curr.next = a;
            a = curr;
            curr = b;
        }
        if(b != null){
            head.next = reverseKGroup(b, k);
        }
        return a;
    }
}
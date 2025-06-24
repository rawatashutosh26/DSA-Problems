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
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        if(head == null || head.next == null){
            return null;
        }
        int a = 0;
        while(curr != null){
            curr = curr.next;
            a++;
        }
        int x = a/2-1;
        curr = head;
        for(int i = 0; i < x; i++){
            curr = curr.next;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
        }
        return head;
    }
}
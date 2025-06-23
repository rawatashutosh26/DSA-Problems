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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode curr = head;

        Stack<Integer> st = new Stack<>();
        while(curr != null){
            st.push(curr.val);
            curr = curr.next; 
        }
        curr = head;
        while(curr != null){
            curr.val = st.pop();
            curr = curr.next;
        }
        return head;

    }
}
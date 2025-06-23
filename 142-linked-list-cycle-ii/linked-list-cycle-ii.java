/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // HashSet<ListNode> visit = new HashSet<>();
        // ListNode curr = head;
        // while(curr != null){
        //     if(visit.contains(curr)){
        //         return curr;
        //     }
        //     visit.add(curr);
        //     curr = curr.next;
        // }
        // return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode start = head;
                while(start != slow){
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }
}
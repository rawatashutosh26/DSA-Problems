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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int a = 0;
        while(curr != null){
            curr = curr.next;
            a++;
        }
        curr = head;
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = curr.val;
            curr = curr.next;
        }
        Arrays.sort(arr);
        curr = head;
        for(int i = 0; i < a; i++){
            curr.val = arr[i];
            curr = curr.next;
        }

        return head;
    }
}
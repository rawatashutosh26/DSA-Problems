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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = list1;
        ListNode curr1 = list2;
        int a = 0;
        while(curr != null){
            curr = curr.next;
            a++;
        }
        while(curr1 != null){
            curr1 = curr1.next;
            a++;
        }

        int[] arr = new int[a];
        int x = 0;
        curr = list1;
        curr1 = list2;
        while(curr != null){
            arr[x++] = curr.val;
            curr = curr.next;
            
        }
        while(curr1 != null){
            arr[x++] = curr1.val;
            curr1 = curr1.next;
        }
        Arrays.sort(arr);
        ListNode newN = new ListNode(0);
        ListNode curr2 = newN;
        for(int i = 0; i < a; i++){
            curr2.next = new ListNode(arr[i]);
            curr2 = curr2.next;
        }
        return newN.next;
    }
}
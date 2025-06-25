/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        int a = 0;
        while(curr != null){
            curr = curr.next;
            a++;
        }
        curr = head;
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = curr.data;
            curr = curr.next;
        }
        Arrays.sort(arr);
        curr = head;
        for(int i = 0; i < a; i++){
            curr.data = arr[i];
            curr = curr.next;
        }

        return head;
    }
}
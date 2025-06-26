/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        Node curr = head;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        // if (head == null) return arr;
        // while(curr != null){
        //     Node curr1 = curr.next;
        //     while(curr1 != null){
        //         if(curr.data + curr1.data == target){
        //             ArrayList<Integer> arr1 = new ArrayList<>();
        //             arr1.add(curr.data);
        //             arr1.add(curr1.data);
        //             arr.add(arr1);
        //         }
        //         curr1 = curr1.next;
        //     }
        //     curr = curr.next;
        // }
        // return arr;
        Node l = head;
        Node r = head;
        
        while(r.next != null){
            r = r.next;
        }
        
        while(l != null && r != null && l != r && r.next != l){
            int a = l.data + r.data;
            
            if(a == target){
                ArrayList<Integer> arr1 = new ArrayList<>();
                arr1.add(l.data);
                arr1.add(r.data);
                arr.add(arr1);
                l = l.next;
                r = r.prev;
            }else if(a < target){
                l = l.next;
            }else{
                r = r.prev;
            }
        }
        return arr;
    }
}

package LinkList;

public class DeleteNodenaLinkedList {

//    Input: head = [4,5,1,9], node = 5
//    Output: [4,1,9]
//    Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
//

    public static void deleteNode(ListNode node) {
        if(node==null){
            return;
        }
        node.val = node.next.val;
        node.next= node.next.next;
    }

    public static ListNode arrayLinkedList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            current.next = newNode;
            current = current.next;
        }
        return head;
    }
    public static void printLinkList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static void main (String[] args){
        ListNode head = arrayLinkedList(new int[]{1, 2, 1});
        deleteNode(head.next);
        printLinkList(head);
    }
}

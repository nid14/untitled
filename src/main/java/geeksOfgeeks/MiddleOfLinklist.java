package geeksOfgeeks;

import LinkList.ListNode;

public class MiddleOfLinklist {

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = arrayLinkedList(new int[] {1, 2, 3, 4, 5, 6});
        head = middleNode(head);
        printLinkList(head);

    }
}

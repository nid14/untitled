package LinkList;

import java.util.ArrayList;
import java.util.List;

public class PalindromLinkList {
//
//    Input: 1->2
//    Output: false

    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        System.out.println(list.toString());
        int index1 = 0;
        int index2 = list.size() - 1;
        while (index1 < index2) {
            if (list.get(index1).equals(list.get(index2))) {
                index1++;
                index2--;
            } else {
                return false;
            }
        }
        return true;
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

    public static void main(String[] args) {
        ListNode head = arrayLinkedList(new int[]{1, 2, 1});
        System.out.println(isPalindrome(head));

    }


}
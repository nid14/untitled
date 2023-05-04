package LinkList;

public class ListNode {
    int val;
    public ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode next){
        this.next = next;
    }
}

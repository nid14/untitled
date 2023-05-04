public class LinkListTest {

    public static void main(String[] args) {
        Node head = arrayLinkedList(new int[]{1, 2, 3, 4, 5, 6});
//        printLinkList(head);
//        printLinkList(head,13);
//        insertLinkedList(head, 7,1);
//        addNumberToTail(head,6);
//        addNumberToTail(head,6);
//        head = addNumberToHead(head, 0);
//        int head1= middleValue(head);
//        int head1= lastThirdElement(head,2);
//        System.out.println(head1);
//          int value = logNMiddleValue(head);
//          System.out.println(value);
//        removeElement(head, 4);
        head = reverseLinkList(head);
        printLinkList(head);
    }

    public static void printLinkList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static Node arrayLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            current = current.next;

        }
        return head;

    }

    public static void printLinkList(Node head, int count) {
        Node current = head;
        int count1 = 0;
        while (current != null && count1 < count) {
            System.out.println(current.value);
            current = current.next;
            count1++;
        }
    }

    public static void insertLinkedList(Node head, int number, int count) {
        Node newElement = new Node(number);
        Node current = head;

        int index = 1;
        while (current.next != null && index < count) {
            current = current.next;
            index++;
        }
        Node temp = current.next;
        current.next = newElement;
        newElement.next = temp;
    }

    public static void addNumberToTail(Node head, int number) {
        Node newElement = new Node(number);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newElement;
    }

    public static Node addNumberToHead(Node head, int number) {
        Node newElement = new Node(number);
        newElement.next = head;
        head = newElement;
        return head;

    }

    public static int middleValue(Node head) {
        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        int middleLength = length / 2 + 1;
        int index = 1;
        current = head;
        while (current.next != null && index < middleLength) {
            current = current.next;
            index++;
        }
        return current.value;
    }


    public static int lastThirdElement(Node head, int countLast) {
        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        int position = length - countLast + 1;
        int index = 1;
        current = head;
        while (current.next != null && index < position) {
            current = current.next;
            index++;
        }
        return current.value;
    }

    public static int logNMiddleValue(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }


    public static void removeElement(Node head, int removeElement) {
        Node current = head;
        while (current.next != null) {
            if (current.next.value == removeElement) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }

    public static Node reverseLinkList(Node head) {
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

}



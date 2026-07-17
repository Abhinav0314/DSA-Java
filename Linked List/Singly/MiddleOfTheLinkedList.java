public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

    public static void main(String[] args) {
        MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();
        
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode mid = solution.middleNode(head);
        
        System.out.println("Middle node value: " + (mid != null ? mid.val : "null"));
    }
}

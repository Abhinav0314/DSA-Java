public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }
        
        return null;
    }

    public static void main(String[] args) {
        LinkedListCycleII solution = new LinkedListCycleII();
        
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNeg4 = new ListNode(-4);
        
        head.next = node2;
        node2.next = node0;
        node0.next = nodeNeg4;
        nodeNeg4.next = node2;
        
        ListNode cycleStart = solution.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Tail connects to node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle found.");
        }
    }
}

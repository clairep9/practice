package ScratchPaper;

public class Main {
    public static void main(String[] args) {
        ListNode linkedlist = new ListNode(1);
        linkedlist.next = new ListNode(2);
        linkedlist.next.next = new ListNode(3);
        linkedlist.next.next.next = new ListNode(4);
        linkedlist.next.next.next.next = new ListNode(5);
        linkedlist.next.next.next.next.next = linkedlist.next.next.next;

        CycleDetection cycleDetection = new CycleDetection();
        System.out.println("check cycle: " + cycleDetection.hasCycle(linkedlist));
    }
}

class Solution {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = reverse(slow.next);
        slow.next = null;

        ListNode t1 = head;
        ListNode t2 = head2;

        while (t1 != null && t2 != null) {

            ListNode next1 = t1.next;
            ListNode next2 = t2.next;

            t1.next = t2;
            t2.next = next1;

            t1 = next1;
            t2 = next2;
        }
    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
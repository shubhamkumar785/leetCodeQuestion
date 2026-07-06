class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode t2 = slow.next;
        slow.next = null;

        ListNode t1 = sortList(head);
        t2 = sortList(t2);

        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                t.next = t1;
                t1 = t1.next;
                t = t.next;
            }
            else{
                t.next = t2;
                t2 = t2.next;
                t = t.next;
            }
        }

        if(t1 == null){
            t.next = t2;
        }
        else{
            t.next = t1;
        }

        return dummy.next;
    }
}
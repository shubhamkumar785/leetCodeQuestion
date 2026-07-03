/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (k > size) {
            return null;
        }
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        int idx = size - k;
        ListNode second = head;
        for (int i = 0; i < idx; i++) {
            second = second.next;
        }
        int data = first.val;
        first.val = second.val;
        second.val = data;

        return head;
    }
}
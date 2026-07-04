/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int size1 = 0;
        while(temp1 != null){
            size1++;
            temp1 = temp1.next;
        }
        temp1 = headA;
        int size2 =0;
        while(temp2 != null){
            size2++;
            temp2 = temp2.next;
        }
        temp2 = headB;

        if(size1 > size2){
            int diff1 = size1 - size2;
            for(int i=0; i<diff1; i++){
                temp1 = temp1.next;
            }
        }
        else{
            int diff2 = size2 - size1;
            for(int i=0; i<diff2; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
        
    }
}
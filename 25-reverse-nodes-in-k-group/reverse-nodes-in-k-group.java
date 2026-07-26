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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        if (head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;

        for (int i = 0; i < k; i++) {

            if (temp != null) {
                temp = temp.next;
            } else {
                return head;
            }
        }

        ListNode prev = null;
        ListNode current = head;
        
        for(int i = 0; i < k; i++){
            ListNode forward = current.next;

            current.next = prev;
             
            prev = current;
            current = forward;
        }

        head.next = reverseKGroup(current, k);

        return prev;

    }

}
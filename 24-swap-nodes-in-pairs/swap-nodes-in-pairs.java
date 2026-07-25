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
    public ListNode swapPairs(ListNode head) {
        int length = 0;

        if(head == null || head.next == null){
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        ListNode remainingList = swapPairs(second.next);
        second.next = first;
        first.next = remainingList;

        return second;
        
    }


}
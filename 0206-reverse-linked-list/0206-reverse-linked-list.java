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
    public ListNode reverseList(ListNode head) {

        ListNode head2 = null;
        ListNode temp = head;

        while(temp != null)
        {
            head = head.next;
            temp.next = head2;
            head2 = temp;
            temp=head;
        }
        return head2;
        
    }
}
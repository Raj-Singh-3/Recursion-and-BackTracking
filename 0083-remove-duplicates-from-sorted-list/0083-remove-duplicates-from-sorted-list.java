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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp!=null)
        {
            ListNode temp1 = temp.next;
            while(temp1!=null && temp1.val == temp.val)
            {
                temp1 = temp1.next;
            }
            temp.next = temp1;
            temp = temp.next;
        }
        return head;
    }
}
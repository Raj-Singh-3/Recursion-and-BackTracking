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
        // 1->2->2->3->4->5->5->null
        // 1->3->4->null
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode newNode = new ListNode(-1); // -1 -> null
        head = newNode;
        while(temp!=null)
        {
            ListNode prev = temp;
            ListNode temp1 = temp.next;

            while(temp1 !=null && temp1.val == temp.val)
            {
                prev = temp1;
                temp1 = temp1.next;
            }
            if( prev != temp && temp.val == prev.val)
            {
                temp = temp1;
                prev = temp;
            }
            else {
                newNode.next = temp;
                newNode = newNode.next;
                temp = temp.next;
                newNode.next = null; // so that other nodes not be in my newNodes, only those which appear one time
            }
        }
        return head.next;
    }
}
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
        if(head==null || head.next==null) return head;

        return reverse(head.next, new ListNode(head.val)); //2-3, 1
    }

    ListNode reverse(ListNode head, ListNode rvs){
        if(head.next!=null){ //2-3, 1
            return reverse(head.next, new ListNode(head.val, rvs)); //3-4, 2-1
        } else { //5, 4-3-2-1
            return new ListNode(head.val, rvs);
        }
    }
}
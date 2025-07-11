/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return false;

        ListNode fast = head.next.next;
        while(fast!=null){
            if(head==fast) return true;
            if(fast.next==null) return false;
            head = head.next;
            fast = fast.next.next;
        }

        return false;
    }
}
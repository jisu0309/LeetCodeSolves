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

        return checkCycle(head, head.next);
    }

    boolean checkCycle(ListNode node1, ListNode node2){
        if(node2==null) return false;

        if(node1 == node2){
            return true;
        } else {
            if(node2.next==null) return false;
            return checkCycle(node1.next, node2.next.next);
        }
        
    }
}
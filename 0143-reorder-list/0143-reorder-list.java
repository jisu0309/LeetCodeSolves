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
    public void reorderList(ListNode head) { //1
    
        if(head==null) return;
        
        ListNode next = head.next; //2
        if(next==null) return;

        ListNode last = next;
        while(last.next!=null){ //4
            if(last.next.next==null){ //-
                head.next = last.next; //1-4
                last.next.next = next; //4-2
                last.next = null;
                break;
            }
            last = last.next;
        }        
        reorderList(head.next.next);
        return;
    }
}

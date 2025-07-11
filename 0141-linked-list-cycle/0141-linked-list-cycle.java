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

        ListNode tmp = head;
        // System.out.println("before/ head:"+head.val+", tmp:"+tmp.val);
        while(head!=null && head.next!=null){
            head = head.next.next;
            tmp = tmp.next;
            // System.out.println("head:"+head.val+", tmp:"+tmp.val);

            if(head==tmp){
                // System.out.println("break/");
                return true;
            }
        }
        
        // System.out.println("final/ head:"+head.val+", tmp:"+tmp.val);
        return false;
    }
}
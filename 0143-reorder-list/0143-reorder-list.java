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

        if(head==null || head.next==null || head.next.next==null) return;

        // find middle

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }        

        // reverse

        slow = slow.next;
        ListNode prev = null;
        ListNode next = slow.next;

        while(slow!=null){
            next = slow.next;
            
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // merge

        ListNode headTmp = head;
        ListNode prevTmp = prev;
        while(head!=null){
            //system.out.printf("\n head(%s,%s) ", head.val, headTmp.val);

            headTmp = head.next;
            head.next = prev;
            

            if(prev!=null) {
                //system.out.printf(" prev(%s,%s) ", prev.val, prevTmp.val);
                prevTmp = prev.next; 
                prev.next = headTmp;
                prev = prevTmp;
            } else{
                break;
            }

            head = headTmp;

            //system.out.printf("\n--> head=%d, prev=%d\n", head==null?null:head.val, prev==null?null:prev.val);
        }

        
        
      
        return;
    }

}

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode head = null;
        if(list1.val<=list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        merge(head, list1, list2);

        return head;        
    }

    void merge(ListNode head, ListNode list1, ListNode list2){        
        if(list1==null){
            if(list2 != null) head.next = list2;
            return;
        }
        if(list2==null){
            head.next = list1;
            return;
        }

        if(list1.val <= list2.val){
            head.next = list1;
            list1 = list1.next;
        } else {
            head.next = list2;
            list2 = list2.next;
        }
        
        head = head.next;
        merge(head, list1, list2);
    }
}
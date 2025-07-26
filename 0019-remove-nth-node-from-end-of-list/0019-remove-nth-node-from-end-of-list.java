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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;

        ListNode searcher = head;
        ListNode marker = head;

        int cnt = 0;
        while(searcher.next!=null){
            System.out.printf("%d) mk=%d, sc=%d\n", cnt, marker.val, searcher.val);

            if(cnt++>=n){
                marker = marker.next;
            }
            searcher = searcher.next;
        }
            System.out.printf("fin) mk=%d, sc=%d\n", marker.val, searcher.val);

        if(cnt<n) return marker.next;
        marker.next = marker.next==null?null:marker.next.next;

        return head;        
    }
}
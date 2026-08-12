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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode x:lists){
            if(x!=null){
                pq.add(x);
            }        
        }

        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(!pq.isEmpty()){
            ListNode rem = pq.poll();
            curr.next =rem;
            curr = curr.next;
            if(rem.next!=null){
                pq.add(rem.next);
            }
        }
       return dummy.next; 
    }
}

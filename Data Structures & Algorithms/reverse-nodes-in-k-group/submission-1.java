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
    public ListNode reverseKGroup(ListNode head, int k) {
        //first check whether if k nodes exist or not

        int count=0;
        ListNode curr = head;
        for(int i=0;i<k;i++){
            if(curr!=null){
                curr = curr.next;
                count++;
            }
        }

        //if k nodes not present then return
        if(count<k){
            return head
        }

        //if present then reverse it
        count=0;
        ListNode prev=null;
        ListNode currNode = head;
        ListNode next = currNode.next;
        while(count<k){
            currNode.next = prev;
            prev = currNode;
            currNode = next;
            if(next!=null){
                next=next.next;
            }
        }
        head.next = reverseKGroup(currNode,k);
        return prev;
    }
}

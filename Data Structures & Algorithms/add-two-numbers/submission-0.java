
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = rev(l1);
        ListNode second = rev(l2);

        StringBuilder s1 = new StringBuilder();
        while(first!=null){
            String str = Integer.toString(first.val);
            s1.append(str);
            first = first.next;
        }
    long num1 = Long.parseLong(s1.toString());

        StringBuilder s2 = new StringBuilder();
        while(second!=null){
            String str = Integer.toString(second.val);
            s2.append(str);
            second = second.next;
        }
      long num2 = Long.parseLong(s2.toString());

        long sum = num1 + num2;
        if(sum==0){
            return new ListNode(0);
        }
        ListNode ans = null;
        

        while(sum>0){
                long digit = sum%10;
              ListNode  dummy = new ListNode((int)digit);
              dummy.next = ans;
              ans=dummy;
              sum /=10;
        }

        


        return rev(ans);

    }

    public ListNode rev(ListNode head){
        if( head==null || head.next==null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}
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

        while (first != null) {
            s1.append(first.val);
            first = first.next;
        }

        java.math.BigInteger num1 =
            new java.math.BigInteger(s1.toString());

        StringBuilder s2 = new StringBuilder();

        while (second != null) {
            s2.append(second.val);
            second = second.next;
        }

        java.math.BigInteger num2 =
            new java.math.BigInteger(s2.toString());

        java.math.BigInteger sum = num1.add(num2);

        if (sum.equals(java.math.BigInteger.ZERO)) {
            return new ListNode(0);
        }

        ListNode ans = null;

        while (sum.compareTo(java.math.BigInteger.ZERO) > 0) {

            java.math.BigInteger digit =
                sum.mod(java.math.BigInteger.TEN);

            ListNode dummy =
                new ListNode(digit.intValue());

            dummy.next = ans;
            ans = dummy;

            sum = sum.divide(java.math.BigInteger.TEN);
        }

        return rev(ans);
    }

    public ListNode rev(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
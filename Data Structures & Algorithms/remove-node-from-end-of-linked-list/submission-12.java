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
             public ListNode  removeNthFromEnd(ListNode head, int k) {
                       if(head==null || head.next==null){
                                   return null;
                                           }
                                                  ListNode tail = head;
                                                         int n = 1;
                                                                while(tail.next!=null){
                                                                        tail=tail.next;
                                                                                n++;
                                                                                       }
                                                                                              int r = n-k+1;
                                                                                                      if(r==1){
                                                                                                                  return head.next;
                                                                                                                          }
                                                                                                                                 ListNode temp = head;
                                                                                                                                        delete(r,head);
                                                                                                                                               return head;

                                                                                                                                                   }
                                                                                                                                                       public void delete(int index,ListNode head){
                                                                                                                                                              
                                                                                                                                                                   
                                                                                                                                                                           while(index>2 && head!=null){
                                                                                                                                                                                       head = head.next;
                                                                                                                                                                                                   index--;
                                                                                                                                                                                                           }
                                                                                                                                                                                                                   
                                                                                                                                                                                                                           head.next = head.next.next;
                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                             }
                                                                                                                                                                                                                                             }
                                                                                                                                                                                                                                            
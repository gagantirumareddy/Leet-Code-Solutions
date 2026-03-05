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
        ListNode new1 = new ListNode(0);
        ListNode curr=new1;
        int carry=0;
        int v1,v2;

        while(l1!=null||l2!=null||carry!=0){
            if(l1!=null){
              v1=l1.val;
            }else v1= 0;
            if(l2!=null){
              v2=l2.val;
            }else v2= 0;
            int total=v1+v2+carry;
             int val=total%10;
            carry= total/10;
            ListNode new2= new ListNode(val);
            curr.next=new2;
            curr=curr.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return new1.next;
    }
}

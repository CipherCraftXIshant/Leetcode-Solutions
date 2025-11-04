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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tempo = new ListNode(-1);
        ListNode tempe = new ListNode(0);
        ListNode temp1 = tempe;
        ListNode temp2 = tempo;
        ListNode temp = head;
        int count = 1;
        while(temp!=null){
            if(count%2==0){
                ListNode a = new ListNode(temp.val);
                temp2.next = a;
                temp2=a;
            }else{
                ListNode a = new ListNode(temp.val);
                temp1.next = a;
                temp1=a;
            }
            temp=temp.next;
            count++;
        }

    temp1.next = tempo.next;
    return tempe.next;
    }
}
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> dup = new HashSet<>();
        for(int num : nums){
            dup.add(num);
        }

        ListNode res = new ListNode(-1);
        ListNode temp = res;
        while(head!=null){
            if(!dup.contains(head.val)){
                temp.next = head;
                temp = temp.next;
            }
            head=head.next;
        }
        temp.next=null;
        return res.next;
    }
}
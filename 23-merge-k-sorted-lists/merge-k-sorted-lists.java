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
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
        while(lists[i]!=null){
            arr.add(lists[i].val);
            lists[i] = lists[i].next;
        }
        }
        Collections.sort(arr);
        ListNode nw = new ListNode(0);
        ListNode sw = nw;
        int n = arr.size();
        for(int i=0;i<n;i++){
            nw.next = new ListNode(arr.get(i));
            nw = nw.next;
        }
        return sw.next;
    }
}
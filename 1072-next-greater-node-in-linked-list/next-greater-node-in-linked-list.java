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
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            ans.add(temp.val);
            temp = temp.next;
        }

        int res[] = new int[count];
        Stack<Integer>st = new Stack<>();

        res[count-1] = 0;
        st.push(ans.get(count-1));
        for(int i=count-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=ans.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = 0;
            }else{
                res[i] = st.peek();
            }
            st.push(ans.get(i));
        }
        return res;
    }
}
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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        String res="";
        while(temp.next!=null){
           res+=Integer.toString(temp.val);
           temp=temp.next;

        }
           res+=Integer.toString(temp.val);
        return Integer.parseInt(res,2);
    }
}
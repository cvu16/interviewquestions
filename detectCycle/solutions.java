/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return false;
        ListNode temp = head;
        while(temp!=null){
            ListNode temp2 = temp.next;
            if(temp.val==100001) return true;
            temp.next = new ListNode(100001);
            temp=temp2;
        }
        return false;
    }
}

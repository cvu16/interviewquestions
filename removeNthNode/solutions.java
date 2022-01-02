//Two pass solutions
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;
        ListNode curr = head;
        while(curr.next!=null){
            curr=curr.next;
            size++;
        }
        int target = size - n;
        if(target==0){
            head=head.next;
            return head;
        }
        curr = head;
        for(int i = 0; i<target; i++){
            if(i==target-1){
                curr.next=curr.next.next;
                break;
            }else curr=curr.next;
        }
        return head;
    }
}

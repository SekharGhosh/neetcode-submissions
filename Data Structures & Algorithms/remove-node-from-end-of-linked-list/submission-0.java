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
        ListNode curr = head;
        List<ListNode> nodes = new ArrayList<>();
       while(curr!=null){
        nodes.add(curr);
        curr = curr.next;
       }
       int nthIndex = nodes.size()-n;
       if(nthIndex ==0){
        return head.next;
       }
      
        nodes.get(nthIndex-1).next = nodes.get(nthIndex).next;
       
       return head;
       
    }
}

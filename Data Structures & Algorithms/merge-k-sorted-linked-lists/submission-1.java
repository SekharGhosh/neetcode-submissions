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

        if(lists.length==0) return null;
        List<Integer> listVal = new ArrayList<>();

        for(ListNode n : lists){
            while(n!=null){
                listVal.add(n.val);
                n = n.next;
            } 
        }
        Collections.sort(listVal);

        ListNode res = new ListNode(0);
        ListNode curr = res;
        for(int val : listVal){
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return res.next;


    }
}

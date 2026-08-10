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
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode temp_head = head;
        while(temp_head != null){
            ListNode next_node = temp_head.next;
            temp_head.next = temp;
            temp = temp_head;
            temp_head = next_node;
        }

        return temp;
    }
}












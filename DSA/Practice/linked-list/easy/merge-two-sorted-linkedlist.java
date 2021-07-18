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

// Time:  O(n) - Travesing the linked list of 'n' nodes
// Space: O(1) - Since, some variables of constant space are being used

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1); // created a dummy node
        ListNode headBackup = head;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
                head = head.next;
            } else {
                head.next = list2;
                list2 = list2.next;
                head = head.next;
            }
        }
        
        if (list1 != null) {
            head.next = list1;            
        } else {
            head.next = list2;
        }
        
        return headBackup.next;
    }
}









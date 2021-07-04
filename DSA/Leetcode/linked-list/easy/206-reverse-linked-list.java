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

// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the length of the linked list
// Space: O(1) - Since constant space pointers are being used

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode slowPointer = null;
        ListNode currentPointer = head;
        ListNode fastPointer = null;
        
        while (currentPointer != null) {
            fastPointer = currentPointer.next; // Backup
            currentPointer.next = slowPointer;
            
            slowPointer = currentPointer;
            currentPointer = fastPointer;
        }
        return slowPointer;
    }
}

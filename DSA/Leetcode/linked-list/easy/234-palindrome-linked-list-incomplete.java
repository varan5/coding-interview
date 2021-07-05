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
// Time:  O(n) - Where 'n' is the number of nodes in the linked list
// Space: O(1) - Since we are using some constant space pointers and variables

class Solution {
    
    public static ListNode reverseLinkedList(ListNode head) {
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
    
    public static boolean compareLinkedLists(ListNode head1, ListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
        
    
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        if (head.next == null)
            return true; // Only 1 element is present
        
        ListNode newHead = reverseLinkedList(head);
        boolean result = compareLinkedLists(head, newHead);
        
        return result;
    }
}

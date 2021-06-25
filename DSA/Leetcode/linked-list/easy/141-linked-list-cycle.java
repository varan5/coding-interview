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

// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the number of nodes in the linked list
// Space: O(1) - Since only 2 addition pointers are being used, resulting in constant space complexity

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        if (head.next == null)
            return false;
        
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        
        return false;
    }
}

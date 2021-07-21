// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the length of the array 'nums'
// Space: O(n) - Since, we are using a prioritiy queue to use min heap

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int element: nums) {
            minHeap.add(element);
            if (minHeap.size() > k) {
                minHeap.remove();
            }       
        }
        // Only 'k' elements are remaining
        // Since, this is the min heap, so the largest value will be at the root
        // So, lets remove it
        return minHeap.remove();
    }
}

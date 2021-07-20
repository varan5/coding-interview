// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the size of the nums1 array
// Space: O(n) - Since, we are using HashSet to store elements from the 'nums1' and one for intersection elements

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int element: nums1) {
            set.add(element);
        }
        
        HashSet<Integer> intersection = new HashSet<>();
        for (int element: nums2) {
            if (set.contains(element)) {
                intersection.add(element);
            }
        }
        
        int[] intesectionArray = new int[intersection.size()];
        int currentIndex = 0;
        for (int element: intersection) {
            intesectionArray[currentIndex] = element;
            currentIndex ++;
        }
        
        return intesectionArray;
    }
}

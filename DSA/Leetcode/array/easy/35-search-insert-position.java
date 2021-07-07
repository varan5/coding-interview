// Time:  O(logn)
// Space: O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length -1;
        int middleIndex;
        
        while (startIndex <= endIndex) {
            middleIndex = (startIndex + endIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            }
            else if (nums[middleIndex] > target) {
                endIndex = middleIndex -1;
            }
            else {
                startIndex = middleIndex +1;
            }
        } 
        
        return startIndex;  // If element not found, then the possible index will naturally be startIndex
    }
}

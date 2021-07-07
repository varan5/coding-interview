// Time:  O(logn)
// Space: O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
      int startIndex = 0;
      int endIndex = nums.length -1;
      int middleIndex;
      int middleElement;
      
      while (startIndex <= endIndex) {
        middleIndex = (startIndex + endIndex) / 2;
        middleElement = nums[middleIndex];
        if (middleElement == target) {
          return middleIndex;
        }
        else if (middleElement > target) {
          endIndex = middleIndex -1;
        }
        else {
          startIndex = middleIndex +1;
        }
      }
      
      return startIndex; // If target not found, it should be in the index 'startIndex' naturally
    }
}

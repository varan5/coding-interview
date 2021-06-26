// Algorithmic Complexities
// TIME: O(n):  Where n is the number of elements in the array
// Space: O(1): Since we are creating an array of size 2 (constant)

class Solution {
   
    public int[] twoSum(int[] array, int targetSum) {
        if (array == null && array.length == 1) {
            return new int[] {-1, -1};
        }
        
        int startIndex = 0;
        int endIndex = array.length -1;
        int potentialSum;
        while (startIndex < endIndex) {
            potentialSum = array[startIndex] + array[endIndex];
            if (potentialSum == targetSum) {
                return new int[] {startIndex +1, endIndex +1};
            }
            else if (potentialSum < targetSum) {
                startIndex ++;
            }
            else {
                endIndex --;
            }
        }
        
        return new int[] {-1, -1};
    }
}
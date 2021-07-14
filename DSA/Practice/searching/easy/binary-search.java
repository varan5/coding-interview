// Algorithmic Complexities
// Time:  O(logn) - Where 'n' is the length of the array 'nums'
// Space: O(1)    - Since we are using some variables of constant space

class Solution {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length -1;
        int middleIndex;
        int middleElement;
        
        while (startIndex <= endIndex) {
            middleIndex = (startIndex + endIndex) / 2;
            middleElement = nums[middleIndex];
            if (middleElement == target)
                return middleIndex;
            else if (middleElement > target) 
                endIndex = middleIndex -1;
            else 
                startIndex = middleIndex +1;
        }
        
        return -1;
    }
}

// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the length of the 'nums' array
// Space: O(1) - Since, we are variables having constant space

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] < nums[i+1]) {
                isDecreasing = false;
            }
            if (nums[i] > nums[i+1]) {
                isIncreasing = false;
            }
        }
        
        return isIncreasing || isDecreasing;
    }
}

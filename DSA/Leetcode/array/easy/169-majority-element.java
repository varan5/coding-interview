// Algorithmic Complexities
// Time:  O(nlogn) - Since 'nums' array is being sorted
// Space: O(1) - Since sorting is inplace, and some constant variables are being used

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int middleIndex = (nums.length -1) / 2;
        int middleElement = nums[middleIndex];
        return middleElement;
    }
}

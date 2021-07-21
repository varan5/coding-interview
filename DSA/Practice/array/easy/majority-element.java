// Algorithmic Complexities
// Time:  O(nlogn) - Where 'n' is the number of elements in the array 'nums'
// Space: O(1) - Since constant size extra space is being used

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int middleIndex = (nums.length -1) / 2;
        int middleElement = nums[middleIndex];
        return middleElement;
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int uniqueNumberIndex = 0;
        while (uniqueNumberIndex < nums.length) {

            if (nums[uniqueNumberIndex] == val) {

                break;
            }
            uniqueNumberIndex++;
        }

        int currentIndex = uniqueNumberIndex + 1;
        while (currentIndex < nums.length) {

            if (val == nums[currentIndex]) {

                currentIndex++;
            } else {

                nums[uniqueNumberIndex] = nums[currentIndex];
                uniqueNumberIndex++;
                currentIndex++;

            }
        }
        return uniqueNumberIndex;
    }
}
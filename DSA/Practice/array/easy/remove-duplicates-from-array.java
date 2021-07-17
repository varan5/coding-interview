class Solution {
    public int removeDuplicates(int[] nums) {
        
        // Base case checking
        
        // No elements in array, so no unique element present
        if (nums.length == 0) 
            return 0;
        
        // If array has only 1 element, it will always be unique
        if (nums.length == 1)
            return 1;
        
           // Since we can consider 1st element of the nums array to be unique, hence we have initialized uniqueElementCounter to 1
        int uniqueElementCounter = 1;
     
        // Loop from first element to last element -1 index, and compare the current index element with the next (adjacent) number. And check if NOT EQUAL
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[uniqueElementCounter++] = nums[i+1];
            }
        }
        return uniqueElementCounter;
    }
}

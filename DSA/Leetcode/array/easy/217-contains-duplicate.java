// Time:  O(n)
// Space: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int currentElement = nums[i];
            if (set.contains(currentElement)) {
                return true;
            }
            set.add(currentElement);
        }
        
        return false;
    }
}

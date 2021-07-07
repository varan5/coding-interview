// Time:  O(n)
// Space: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      for (int element: nums) {
        if (set.contains(element)) {
          return true;
        }
        set.add(element);
      }
      
      return false;
    }
}

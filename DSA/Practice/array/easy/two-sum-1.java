
// Time:  O(n^2)
// Space: O(1)

public class Code {
  public int[] twoSum(int[] array, int targetSum) {
    int potentialSum;
    for (int i = 0; i < array.length -1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        potentialSum = array[i] + array[j];
        if (potentialSum == targetSum) {
          return new int[] {i, j};
        }
      }
    }
    
    return new int[] {-1, -1};
  }
}

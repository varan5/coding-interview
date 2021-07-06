public class Code {
  public twoSum(int[] array, int targetSum) {
    int startIndex = 0;
    int endIndex = array.length -1;
    int potentialSum;
    while (startIndex < endIndex) {
      potentialSum = array[startIndex] + array[endIndex];
      if (potentialSum == targetSum) {
        return new int[] {startIndex, endIndex};
      }
      else if (potentialSum < targetSum) {
        startIndex ++;
      }
      else {
        endIndex --;
      }
    }
  }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 1)
            return new int[] {-1, -1};
        
        int startIndex = 0;
        int endIndex = numbers.length -1;
        int potentialSum;
        
        while (startIndex < endIndex) {
            potentialSum = numbers[startIndex] + numbers[endIndex];
            if (potentialSum == target) {
                return new int[] {startIndex +1, endIndex +1};
            }
            else if (potentialSum > target) {
                endIndex --;
            }
            else {
                startIndex ++;
            }
        }
        
        return new int[] {-1, -1};
    }
}

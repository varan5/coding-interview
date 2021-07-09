// Time:  O(n)
// Space: O(n)

import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int numberOfGoodPairs = 0;
        for (int key: nums) {
            if (hashMap.containsKey(key)) {
                int valueCount = hashMap.get(key);
                numberOfGoodPairs += valueCount;
                hashMap.put(key, valueCount +1);
            } else {
                hashMap.put(key, 1);  
            }
        }
        return numberOfGoodPairs;
    }
}




/*

// Time:  O(n^2)
// Space: O(1)

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numberOfGoodPairs = 0;
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    numberOfGoodPairs ++;
            }
        }      
        return numberOfGoodPairs;
    }
}

*/

// Time:  O(n)
// Space: O(1)

class Solution {
    public boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int numberBackup = number;
        int reminder;
        
        while (number > 0) {
            reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number = number / 10;
        }
        
        if (numberBackup == reversedNumber)
            return true;
        
        return false;
    }
}

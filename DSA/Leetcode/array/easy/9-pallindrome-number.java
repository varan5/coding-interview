// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the number of digits in the given number
// Space: O(1) - Since variables with constant space complexity are being used

class Solution {
    public boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int reminder = 0;
        int temporary = number;
        while (number > 0) {
            reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number = number / 10;
        }
        
        if (temporary == reversedNumber) {
            return true;
        }
        else {
            return false;
        }
    }
}
package com.company;


// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the length of the given string
// Space: O(1) - Since, we are using variables with constant space


public class Coding {
    public boolean isStringPalindrome(char[] string) {
        int startIndex = 0;
        int endIndex = string.length -1;
        boolean isPalindrome = true;
        while (startIndex < endIndex) {
            if (string[startIndex] != string[endIndex]) {
                isPalindrome = false;
                return isPalindrome;
            }
            startIndex ++;
            endIndex --;
        }

        return isPalindrome;  // true
    }
}

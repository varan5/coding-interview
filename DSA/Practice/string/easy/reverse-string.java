package com.company;

// Time:  O(n) - Where 'n' is the length of the string
// Space: O(1) - Since, we are using variables of constant space

public class Coding {
    public char[] reverseString(char[] string) {
        int startIndex = 0;
        int endIndex = string.length -1;
        char temporaryCharacter;
        while (startIndex < endIndex) {
            temporaryCharacter = string[startIndex];
            string[startIndex] = string[endIndex];
            string[endIndex] = temporaryCharacter;
         
            startIndex ++;
            endIndex --;
        }
        return string;
    }
}

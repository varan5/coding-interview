// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the number of characters in the given string
// Space: O(1) - Since we are using only 2 variables to store the index, which require a constant space

class Solution {
    public boolean isPalindrome(String string) {
        
        // Starting from the first index of the string
        // End index will be the last index of the string
        int startIndex = 0;
        int endIndex = string.length() -1;
        

        while (startIndex < endIndex) {
            // Ignoring the white spaces and the commas (,) . Only interested in the letters or digits. Java has a function to check this.
            if (! Character.isLetterOrDigit(string.charAt(startIndex)))
                startIndex += 1;
            else if (! Character.isLetterOrDigit(string.charAt(endIndex)))
                endIndex -= 1;
                
            // Main condition for checking if Pallindrome
            // Making the start and end indexes toLowerCase for comparing.
            // Now check whether the startIndex == endIndex.
            // If NOT EQUAL, return false. i.e. Not a pallindrome
            else if (Character.toLowerCase(string.charAt(startIndex)) != Character.toLowerCase(string.charAt(endIndex)))
                return false;
            
            // If nothing works, no worries, just keep moving on
            // So startIndex ++  and endIndex --
            else {
                startIndex += 1;
                endIndex -= 1;
            }
        }
        // Entire string was traversed (visited all the characters)
        // And compared the firstIndex element with the lastIndex element on each iteration of the while loop.
        // But always found the same characters, so the string is Pallindrome
        // So lets return true
        return true;
    }
}

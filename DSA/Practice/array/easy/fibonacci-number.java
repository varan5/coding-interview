
class Solution {
    public int fib(int number) {
        if (number == 0)
            return 0;
        if (number == 1)
            return 1;
        
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        while (number > 1) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            
            number --;
        }
        return sum;
    }
}


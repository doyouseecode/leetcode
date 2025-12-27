class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        long originalCopy = x, reversed = 0;
        while(x!=0){
            int lDigit = x % 10;
            reversed = reversed * 10 + lDigit;
            x/=10;
        }
        return originalCopy == reversed;
    }
};
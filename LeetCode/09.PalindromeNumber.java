class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);

        char[] digits = number.toCharArray(); 

        char[] reverse = new char[digits.length];

        int j = 0;
       for(int i = digits.length - 1 ; i > -1; i--){
       		reverse[j] = digits[i];
       		j++;
       }
       int index = 0;
       while(index < digits.length ){
       		if(digits[index]==reverse[index]){
       			index++;
       		}else{
       			return false;
       		}
       }

       return true;

	}
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = 0, t = x;
        while (t != 0) {
            y = y * 10 + t % 10;
            t /= 10;
        }
        return x == y;
    }
}
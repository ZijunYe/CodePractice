class ReverseInteger {
   /* public int reverse(int x) {
        String number = String.valueOf(x);

        char[] digits = number.toCharArray(); 

        String reverse = "";

        if(digits[0] == '-'){
        	reverse += '-';
        }

       for(int i = digits.length - 1 ; i > 0; i--){
       		reverse += digits[i];

       }

       int n = Integer.parseInt(reverse);

       return n;

       
    }

  */
   	public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + (x % 10);
            x /= 10;
        }
        
        return res < Integer.MIN_VALUE || res > Integer.MAX_VALUE ? 0 : (int) res; // ? means if & else
    }

}
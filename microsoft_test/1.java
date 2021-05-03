class Solution {
    public String solution(String name, String surname, int age) {
        // write your code in Java SE 8
       StringBuilder sb = new StringBuilder();
       String na = name.substring(0,3);
       String sur = name.substring(0,3);
       sb.append(na);
       sb.append(sur);
       sb.append(age);

       return sb.toString();

    }
}

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution2 {
    public int solution(String S) {
        // write your code in Java SE 8
        String [] s = S.split("");
        int check = 0;

}








class Solution3 {
    public int solution(String S) {
       for(int i = 0; i < s.length/2 ; i ++){
       	if(s.charAt(i) != s.charAt(s.length-i-1)){

       	}
       }
    }
}

class Solution {
    public int solution(int[] X, int[] Y) {
        int [] rational = new int[X.length];
       	for(int i = 0; i<X.length; i++){
       		rational[i] = X[i]/Y[i];
       	}
        int count = 0;
       	for(int i = 0; i < rational.length; i++){
       		double root =  rational[i];
       		double stringSum = 0;
       		for(int j = i; j< rational.length; j++){
       			double jumpSum = 0;
       			jumpSum = root + rational[j];
       			stringSum = root + rational[j];
       			if(stringSum == 1){
       				count++;
       				break;
       			}
       			if(stringSum > 1){
       				break;
       			}
       			if(jumpSum == 1){
       				count++;
       			}

       		}
       	}
       	return count;
    }
}










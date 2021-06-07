import java.util.HashMap;

class RomanToInteger {
    public int romanToInt(String s) {
      /*char[] value = s.toCharArray();
        int i = 0;
        int result = 0;
        while(i < value.length){
        	if(value[i] == 'I'){
        		if(i+1 < value.length){
        			if(value[i+1] == 'V'){
	        			result +=4;
	        			i = i + 2;
        			}else if(value[i+1] == 'X'){
	        			result += 9;
	        			i = i + 2;
        			}
        		}else{
        			result +=1;
        			i++;
        		}
        	}else if(value[i] == 'V'){
        		result +=5;
        		i++;
        	}else if(value[i] == 'X'){
        		if(i+1 < value.length){
        			if(value[i+1] == 'L'){
	        			result += 40;
	        			i = i + 2;
        			}else if(value[i+1] == 'C'){
	        			result += 90;
	        			i = i + 2;
        			}
        		}else{
        			result +=10;
        			i++;
        		}
        	}else if(value[i] == 'L'){
        		result += 50;
        		i++;
        	}else if(value[i] == 'C'){
        		if(i+1 < value.length){
        			if(value[i+1] == 'D'){
	        			result +=400;
	        			i = i + 2;
        			}else if(value[i+1] == 'M'){
	        			result += 900;
	        			i = i + 2;
        			}

        		}else{
        			result +=100;
        			i++;
        		}
        	}else if(value[i] == 'D'){
        		result += 500;
        		i++;
        	}else if(value[i] == 'M'){
        		result += 1000;
        		i++;
        	}

        }
       return result;*/

       //using mapping 

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V', 5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M', 1000);
        
        int res = 0;
        
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='I' && i<s.length()-1 &&
               (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                int sub = map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                res += sub;
                i = i+2;
            }
            
            else if(s.charAt(i)=='X' && i<s.length()-1 &&
                    (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                int sub = map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                res += sub;
                i = i+2;
            }
            
            else if(s.charAt(i)=='C' && i<s.length()-1 &&
               (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                int sub = map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                res += sub;
                i= i+2;
            }
            
            else if(map.containsKey(s.charAt(i))){
                res += map.get(s.charAt(i));
                i++;
            }
            
        }
        
        return res;
    }
}
























class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        // loop over each element in the string array 
        // compare with the char 
        
        int c = 0;
        while(c > strs[0].length()){
        	int index = 1;
        	char top = strs[0].charAt(c); 
        	while(index >= strs.length){
        		if(strs[index].charAt(c) == top){
        			index++;
        		}else if(strs[index].charAt(c)!= top){
        			c++;
        			break;
        		}

        		if(index == strs.length-1){
        			str.append(top);
        		}
        	}
        }

       return str.toString();
    }
}
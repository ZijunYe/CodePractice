class IsAnagram{
    public boolean isAnagram(String s, String t) {
            
            if(s.length() != t.length()){
                return false; 
            }
            
            int[] ascii = new int[26]; 
            for(int i =0; i< s.length(); i++){
                ascii[s.charAt(i) - 'a']++; 
                ascii[t.charAt(i) - 'a']--; 
            }
            
            
            
            for(int j = 0; j< ascii.length; j++){
                if(ascii[j] != 0){
                    return false;
                }
            }
            
            return true; 
            
        }


}

    
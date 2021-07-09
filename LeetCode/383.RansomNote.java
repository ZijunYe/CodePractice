class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> hashMap = new HashMap<>(); 

        for(int i = 0; i < magazine.length(); i++){
        	char key = magazine.charAt(i); 
        	if(hashMap.containsKey(key)){
        		hashMap.put(key,hashMap.get(key)+1); 
        	}else{
        		hashMap.put(key,1); 
        	}
        }



        for(int j =0; j < ransomNote.length(); j++){
        	char key = ransomNote.charAt(j);
        	if(hashMap.containsKey(key)==true && hashMap.get(key)!= 0){
        		hashMap.put(key,hashMap.get(key)-1); 
        	}else{
        		return false; 
        	}
        }
        return true; 
    }


      public boolean canConstruct2(String ransomNote, String magazine) {
      	int[] elem = new int[26]; 

      	for(int i = 0; i < magazine.length(); i++){
      		int tmp = magazine.charAt(i) - 'a'; 
      		elem[tmp] +=1; 
      	}


      	for(int j = 0; j < ransomNote.length(); j++){
      		int tmp = ransomNote.charAt(j) -'a'; 
      		if(elem[tmp] != 0){
      			elem[tmp]--;
      		}else{
      			return false;
      		}
      	}
      	return true; 
     }
}
class Sum4 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

    	Map<Integer,Integer> hashMap = new HashMap<>(); 
    	int result =0; // count how many times does 4 value get to 0 

    	for(int i = 0; i< nums1.length; i++){
    		for(int j = 0; j < nums2.length; j++){
    			int sumAB = nums1[i] + nums2[j]; 
    			if(hashMap.containsKey(sumAB)){
    				hashMap.put(sumAB,hashMap.get(sumAB)+1);//it override the sumAB by change it value 
    			}else{
    				hashMap.put(sumAB,1);
    			}
    		}
    	}




    	for(int k = 0; k < nums3.length; k++){
    		for(int l =0; l < nums4.length; l++){
    			int sumCD = -(nums3[k]+nums4[l]); //it opposite of CD, because AB + CD have to equal to 0 
    			if(hashMap.containsKey(sumCD)){ // 4 value equal to 0 
    				result += hashMap.get(sumCD); 
    			}
    		}
    	}

    return result;
        
    }
}
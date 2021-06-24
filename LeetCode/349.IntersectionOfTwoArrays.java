class IntersectionOfTwoArrays {
   public int[] intersection1(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1); 
    	Arrays.sort(nums2); 


    	int[] intersection = new int[nums1.length + nums2.length]; 
    	int index = 0, index1 = 0, index2 = 0; 

    	while(index1 < nums1.length && index2 < nums2.length ){
    		if(nums1[index1] == nums2[index2]){
    			if(index == 0 || intersection[index - 1] != nums1[index1]){
    				intersection[index] = nums1[index1];
    				index++; 
    			}
    			index1++;
    			index2++; 
    		}else if(nums1[index1] > nums2[index2]){//because it already rearranged, so if one is bigger than another, next will be bigger
    			index2++; 
    		}else{
    			index1++;
    		}
    	}

    	return Arrays.copyOfRange(intersection, 0, index); 
        
    }



     public int[] intersection2(int[] nums1, int[] nums2) {
     	if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
     		return new int[0];
     	}

     	Set<Intger> set1 = new HashSet<>(); 
     	Set<Integer> resSet = new HashSet<>(); 

     	for(int i:nums1){
     		set1.add(i);
     	}
     	for(int j : nums2){
     		if(set1.contains(i)){
     			resSet.aff(i); 
     		}
     	}

     	int[] resArray = new int[resSet.size()]; 
     	int index = 0; 
     	for(int i:resSet){
     		resArray[index] = i; 
     		index++; 
     	}
     	return resArray; 
        
    }

}
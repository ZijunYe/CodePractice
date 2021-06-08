class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0; 
        int start = 0; 
        int end = -1; 
        int size = 0;
        int result = nums.length+1; 
        while(start < nums.length){

        	if(sum < target && end +1 < nums.length){
        		end++; // start with -1,so here the first add is 0 index
        		sum += nums[end]; 
        	}else{ // sum bigger than target or end reach the last element 
        		sum -= nums[start]; 
        		start ++; 

        	}


        	/*
        	we start add value to sum, just move the end pointer 
        	if the end pointer reach the value bigger than the target or it reach to the end 
        	if end point reach the value bigger than target 
        		we try the smaller size by remove the first index and see if it still bigger 
        		if not work, than move end pointer 
        		if work move the start pointer 

			*/


        	if(sum >= target){ // when it is equal to each other than update result
        		size = end - start +1; 
        		if(size < result){
        			result = size;
        		}
        		// result = Math.min(result,size); 
        	}

        }
        if(result == nums.length+1){
        		return 0; 
        	}
  
        return result; 
        
    }


    public static void main(String[] args) {
        System.out.println("Testing method results:");
        System.out.println("------------------------");
       
       	int [] array = new int[] {2,3,1,2,4,3};
        int result = minSubArrayLen(7,array);
        System.out.println(result);
        
    }
}












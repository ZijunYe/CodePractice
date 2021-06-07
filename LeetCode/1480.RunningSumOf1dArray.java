class Solution {
    public int[] runningSum(int[] nums) {
    	int[] result = new int[nums.length];
    	for(int i = 0; i < nums.length; i++){
    		if(i == 0 ){
    			result[i] = nums[i];//if it is the first one
    		}else{
    			result[i] = nums[i]+result[i-1];//other situation 
    		}
    			
    	}
    	return result;
        
    }
}


//int intArray[];
//intArray = new int[20];




//int [] name = new int[20];

//int [] name = new int {1,2,3,4,5,6,7,8,9};











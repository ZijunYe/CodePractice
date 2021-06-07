class BinarySearch {
    public static int search(int[] nums, int target) {
    	//recursion 
    	int left= 0;
    	int right = nums.length - 1; 
    	
    	while(left <= right){
    		int middle = left+((right - left)/2);//***防止溢出(left + right)/2; 

    		//#1 current bigger than target--> right index change
    		if(nums[middle] > target){
    			right = middle-1;
    		}
    		//#2 current smaller than target --> left index change
    		else if(nums[middle] < target){
    			left = middle+1;
    		}
    		//3 current is equal to target --> return 
    		else if(nums[middle] == target){
    			return middle;
    		}

    	}

    	return -1;

        
    }


    public static void main(String[] args) {
        System.out.println("Testing method results:");
        System.out.println("------------------------");
       
       	int [] array = new int[] {-1,0,3,5,9,12};
        int result = search(array,9);
        System.out.println(result);
        
    }
}
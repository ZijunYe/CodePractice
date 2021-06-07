class RemoveElement {
    public static int removeElement(int[] nums, int val) {
    	//we need loop over the nums to find out how many val in the array 
    	// we need predetermine the size of new array 
    	//loop the array again,if the value is val then we skip 
    	//return the length of new array 

    	// the origin array need to be change 
    	int n = 0;
    	int [] newA = new int[nums.length];
    	for(int i = 0; i< nums.length; i++){
    		if(nums[i] != val){
    			newA[n] = nums[i];
    			n++;

    		}
    	}

    	for(int i = 0; i<nums.length;i++){
    		nums[i] = newA[i];
    	}


//nums array size should not be change



    	return n;
    }


    public int removeElement2(int[] nums, int val) {

        // 快慢指针
        int fastIndex = 0;
        int slowIndex;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;

    }


 
      
  

    public static void main(String[] args) {
        System.out.println("Testing method results:");
        System.out.println("------------------------");
       
       	int [] array = new int[] {3,2,2,3};
        int result = removeElement(array,3);
        System.out.println(result);
        
    }
}





 /*int n = 0;
    	for(int i = 0; i< nums.length; i++){
    		if(nums[i] == val){
    			n++;
    		}
    	}


    	int length = nums.length - n;
    	int [] newA = new int[length];
    	int index = 0;

    	for(int j=0; j < nums.length; j++){
    		if(nums[j] == val){
    			 System.out.println(nums[j] +"haha");
    		}else{
    			 System.out.println(nums[j]);
    			newA[index] = nums[j];
    			index++;
    		}
    	}


    	for(int a=0; a < newA.length; a++){
    		System.out.print(newA[a]);
    	}
    	return newA.length;*/
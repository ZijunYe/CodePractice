class SortSquares {
    public static int[] sortedSquares(int[] nums) {
    	//在此之前 the nums 已经是sorted list 
    	// 但是区别于square的是， nums中的复数位置会发生移动

    	//we need an new result array to store the sorted square array

    	int[] result = new int [nums.length]; 

    	// we need loop over the array 
    	// we need two pointer
    	//one for end, one for front 




    	int left = 0;
    	int right = nums.length -1; 
    	int index = nums.length - 1; 
    	while(left <= right){
    		if(nums[left]*nums[left] < nums[right] * nums[right]){
    			result[index] = nums[right] * nums[right]; 
    			index--; 
    			right --; 
    		}else{
    			result[index] = nums[left] * nums[left];
    			left++;
    			index--; 
    		}

    		
    	}


    	nums = result; 
    	for(int i = 0; i < nums.length; i++){
        	System.out.println(nums[i]);
        	}


    	return result; 

    }



       /* for(int i = 0; i < nums.length; i++){ // all square first 
        	int n = nums[i];
        	int square = n*n;
        	nums[i] = square; 

        	System.out.println(nums[i]+"squared");
        }

        // using selection sort 

       
        // this can be instead use Array.sort(nums); 
       //from the first element to find the smallest num in the array 
        for(int j = 0; j < nums.length; j++){
        	int s = j; 
        	for(int k = j; k < nums.length; k++){// find smallest nums
        		if(nums[k] < nums[j] ){
        			if(nums[k] < nums[s]){
        				s = k; 
        			}
        		}
        	}
        	System.out.println(nums[j]+"this is before swap"); 
        	System.out.println(nums[s]); 
        	int tmp = nums[j]; 
        	nums[j] = nums[s];
        	nums[s] =tmp; 

        }

        for(int i = 0; i < nums.length; i++){
        	System.out.println(nums[i]);
        }

        return nums;

    }
*/

    public static void main(String[] args) {
        System.out.println("Testing method results:");
        System.out.println("------------------------");
       
       	int [] array = new int[] {-4,-1,0,3,10};
        int [] result = sortedSquares(array);
       
        
    }
}
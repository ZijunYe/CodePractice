

class Sum {
    //brute force 
    public  List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(); 
        
        for(int i = 0; i< nums.length; i++){
        	for(int j = i+1; j < nums.length; j++){
        		for(int k = j+1; k < nums.length; k++){
        			 if(nums[i]+nums[i+j]+nums[i+j+z]==0&&!result.contains(Arrays.asList(nums[i], nums[i+j], nums[i+j+z]))){
                     result.add(Arrays.asList(nums[i], nums[i+j], nums[i+j+z])); 

        			}

        		}
        	}
        }
       return result;


    }

    //双指针
    public  List<List<Integer>> threeSum3(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(); 
        if(nums==null || nums.length < 3){
            return result; 
        }
        Arrays.sort(nums); //排序


        for(int i = 0; i < nums.length; i++){
            if(nums[i]>0){
                break; //immediate terminates 
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue; //jump back to the begining of the loop 
            }
            int left = i+1; 
            int right = nums.length - 1; 
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right]; 
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left] == nums[left+1]) {
                        left++; }
                    while(left < right && nums[right] == nums[right-1]) {
                        right--; }
                    left++; 
                    right--; 
                }else if(sum < 0){
                    left++;}
                else if(sum > 0){
                    right--; }


            }
            
        }

        
       
       return result;


    }


}
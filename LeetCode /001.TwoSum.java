// 000 two sum 

class TwoSum {
    public int[] twoSum(int[] nums, int target) { 
        int [] output = new int[2];
        int check = 0; 
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                check = nums[i] + nums [j];
                if(check == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return null;
    }
 }



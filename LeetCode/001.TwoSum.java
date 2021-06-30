// 000 two sum 

class TwoSum {
    public int[] twoSum(int[] nums, int target) { //DOUBLE LOOP 
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


    public int[] twoSum2(int[] nums,int target){ // hashMap 

        //first we need to create an array that store result 
        int[] result = new int[2]; 
        if(nums.length == 0 || nums == null){
            return result; 
        }


        //create map 
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>(); 
        for(int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];
            if(hashMap.containsKey(tmp)){
                result[1] = i;
                result[0]=hashMap.get(tmp); 
            }

            hashMap.put(nums[i],i); 
        }

        return result; 

    }
 }



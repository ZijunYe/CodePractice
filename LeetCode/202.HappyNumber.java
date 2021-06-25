class 	HappyNumber {
    public boolean isHappy(int n) {
    	int slowRunner = n; 
    	int fastRunner = getNext(n); 
    	while(fastRunner!= 1 && fastRunner != slowRunner){
    		fastRunner = getNext(fastRunner); 
    		slowRunner = getNext(getNext(slowRunner)); 
    	}
        return fastRunner == 1; 
    }


     public boolean isHappy2(int n) {
    	Set<Integer> collection = new HashSet<>(); 
    	while(n!= 1 && !collection.contains(n)){
    		collection.add(n);
    		n = getNext(n); 
    	}

    	return n==1; 
    }



    public int getNext(int n){
    	int totalSum = 0; 
    	while(n >0){
    		int res = n%10; 
    		totalSum += res*res; 
    		n = n/10; 
    	}
    	return totalSum; 

    }
   
}
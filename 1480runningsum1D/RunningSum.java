class RunningSum {
	
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
		results[0] = nums[0];
		
		for (int i =0 ; i< nums.length; i++) {
			results[i] = nums[i]+ results[i-1];
		}
		return results;
	
	// time complexity = O(n)
	// space complexity = O(1)
    }    
	
	public int[] runningSumInPlace(int[] nums) {

		
		for (int i =0 ; i< nums.length; i++) {
			nums[i]+= nums[i-1];
		}
		return nums;
    }
	
	// time complexity = O(n)
	// space complexity = O(1)
}
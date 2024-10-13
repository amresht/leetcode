/*
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
 
 class StepsToZero {
	 
        public int numberOfSteps(int num) {
		int result= num;
		int steps = 0;
		
        // cover the edge case first. If the number is 0 already no steps required.
        if( num == 0)
            return 0;

        // if number is greater than 0
		while (result > 1 ) {
            // for even number divide by two and increment step count
            if (result %2 ==0) {
                result = result / 2;
            }
            else {
                result = result-1;
            }
            steps++;

        } // end while
        // now result =1,  step count for the remaining 1
        steps++;
		return steps;
    } // end method
}
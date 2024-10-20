/**
 * 
 */

 class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        int result[]= new int[2];

        for (int i=0; i < nums.length-1; i++) {
            for (int j = i+1; j< nums.length; j++) {

                if (nums[i]+ nums[j]==target) {

                    return new int[]{i, j};
                }

            }
        }
        return null;
    }
    // a much faster solution
    public int[] twoSumFastest(int[] nums, int target) {
        int n = nums.length;
       for (int i=1; i < n; i++) {
           for (int j = i; j< n; j++) {
               if (nums[j]+ nums[j-i]==target) {
                   return new int[]{j-i, j};
               }
           }

       }
       return null;
   }




    public static void main(String[] args) {
        int[] results = new int[2];
        int[] inputs = new int[]{2,5,5,11};

        results = twoSum(inputs, 10);
        System.out.println(results[0]);
        System.out.println(results[1]);


    }


 }
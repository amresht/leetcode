/*
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

Example 1: Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2: Input: arr = [1,2,3]
Output: [1,2,3]
 */	

class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;

        for(int i=0; i< len; i++) {
            if(arr[i]== 0) {
                // shift the array right
                for (int j= len-1; j > i; j--){
                    arr[j]=arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
    // a much fast er approach.
    public void duplicateZeros2(int[] arr) {
        int count=0;
        boolean isLast=false;
        for(int i=0;i<arr.length-count;i++){
           if(arr[i]==0){
            isLast=(i==arr.length-count-1);
            count++;
           }
        }
        int n=arr.length-1;
        if(isLast){
             arr[n--]=0;
             count--;
        }
        for(int i=n-count;i>=0;i--){
            arr[i+count]=arr[i];

            if(arr[i]==0){
                count--;
                arr[i+count]=0;
            }
        }
    }

}


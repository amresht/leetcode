/*
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Recall that arr is a mountain array if and only if:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*/

public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len < 3) return false;

        // check if the array is constantly increasing
        int i=0;

        // if we found a valley at the start itself
        if (arr[0] > arr[1]) return false;


        for(i = 0; i< len-2; i++) {
            if (arr[i] == arr[i+1]) {
                return false;
            }
            else if (arr[i] > arr[i+1] ) {
                break;  // break from loop as we found a valley
            }
        } // end for

        // find the continuous valley
        for(int j = i; j< len-1; j++) {
            if ( (arr[j] == arr[j+1]) || (arr[j] < arr[j+1]) ) {
                return false;
            }

        }
        return true;
    }        
}

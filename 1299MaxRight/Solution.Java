/*
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 *  and replace the last element with -1. After doing so, return the array.
*/

class Solution {
    public int[] replaceElements(int[] arr) {

        int len = arr.length;
        int maxRt = -1;

        if (len < 2) {
            arr[0] = -1;
        }

        for (int i = len - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRt;

            if (current > maxRt) {
                maxRt = current;
            }
        }
        return arr;

    }
}
/**
 * Given an array arr of integers, check if there exist two indices i and j such that 
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 */

public class NumDoubleinArray {

    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
                for(int i=0; i< len; i++){

            for (int j= 0; j < len; j++) {
                if (i!=j && (arr[i] *2 == arr[j] ) )
                return true;
                
            }

        }
        return false;
    }
}
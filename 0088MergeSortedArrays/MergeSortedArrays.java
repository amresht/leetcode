/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
 * representing the number of elements in nums1 and nums2 respectively. 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should 
 * be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/
public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int r = m + n -1;
        int i= m-1;
        int j= n-1;
        
        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[r] = nums1[i];
                i--;
            }
            else {
                nums1[r] = nums2[j];
                j--;
            }
            r--;
        }
        
    }

    public static void main(String[] args) {
        
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2,5,6};

        merge(nums1, 3, nums2, 3);
        //print the array
        for (int i=0; i < nums1.length;i++) {
            System.out.print(nums1[i]);
            System.out.print(" ");
        }
    }// end main
}

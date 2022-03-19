package array.insertingItems;

import java.util.Arrays;

/*
*
*
*
*/

public class MergeSortedArray {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 2 mang da duoc sap xep
       int i = m + n - 1;
       System.out.println(i);
       int i1 = m - 1;
       int i2 = n - 1;
       while (i1 >= 0 || i2 >= 0) {
           if (i2 < 0) {
               nums1[i--] = nums1[i1--];
           } else if (i1 < 0) {
            nums1[i--] = nums2[i2--];
           } else {
                if (nums1[i1] >= nums2[i2]){
                    nums1[i--] = nums1[i1--];
                } else{
                    nums1[i--] = nums2[i2--];
                }
           }
       } 
    }
    
    
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println( nums1[i] + " ");
        }
    }   
}

package array.deletingArray;

import java.util.Arrays;

public class DeletingArray {
    public static int length = 0;    

    public static int deletingToEndArray(int[] a) {
        // deletion from the end is as simple as reducing the length
        // of the array by 1
        int data = a[length];
        length--;
        return data;
    }   
    
    public static void deletingToStartArray(int[] a){
        for (int i = 1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        length--;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(a));
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[7];
        // add to 6 indexes of the array
        for (int i = 0; i < 6; i++) {
            array[length] = i;
            length++;
        }
        System.out.println(deletingToEndArray(array));
    }
}

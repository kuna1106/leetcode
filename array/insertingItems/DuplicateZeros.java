package array.insertingItems;

public class DuplicateZeros {
    
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length-1;i++) {
            if (arr[i] == 0) {
                // shifting a[i+1] -> a[n-2] sang 1 don vi
                for (int j = arr.length - 2; j >= i + 1; j--) {
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

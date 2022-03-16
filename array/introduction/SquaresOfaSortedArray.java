package array.introduction;
/*
* given a integer arrays nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/

public class SquaresOfaSortedArray {
    public static int[] sortedArray(int[] nums){
        int[] answer = new int[nums.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) Math.pow(nums[i], 2);
        }
        return bubbleSort(answer);
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        printArray(sortedArray(nums));
    }
}

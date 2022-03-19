package array.deletingArray;

/**
 * RemoveElement
 */
public class RemoveElement {
    public static int removeElement(int[] a, int val) {
        int size = 0;
        if (a.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != val) {
                    a[size++] = a[i];
                }
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int a = removeElement(nums, val);
        System.out.println(a);
    }
}
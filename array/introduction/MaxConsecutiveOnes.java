package array.introduction;

/**
 * MaxConsecutiveOnes
 * given a binary array nums. return the maximum numbers of consecutive 1's in the array.
 * Hints: you need to think about two things as far as any window is concerned. One is the starting point for the window. how do you detect that a new window of 1s has started? The next part is detecting the ending point for this window. 
 *how do you detect the ending point for an existing window? 
 *if you fingure these two things out, you will be able to detect the windows of consecutive ones. all that remains afterward is to find the longest such window and return the size.
 */
public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            } else{
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}